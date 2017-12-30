package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import oracle.jdbc.pool.OracleDataSource;

public class DataHandler {

    private final String jdbcUrl = "jdbc:oracle:thin:nt/nt@localhost:1521:xe";
    private Connection conn;

    public DataHandler() {
    }

    public void getDBConnection() throws SQLException {
        OracleDataSource ds;
        ds = new OracleDataSource();
        ds.setURL(this.jdbcUrl);
        this.conn = ds.getConnection();
    }

    //still under construction
    public final ArrayList<String[]> getAvailableExams(int sid) throws SQLException {
        Statement stmt;
        ResultSet rset;
        String query;
        ArrayList<String[]> result = new ArrayList<>();

        this.getDBConnection();
        stmt = this.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

        query = "SELECT t.name AS \"Teacher name\", e.name AS \"Exam name\", e.exam_date AS \"Exam date\" FROM teacher t , exam e ,teacher_students ts "
                + "where ts.sid =" + sid
                + "and ts.study_year = (select extract(year from e.exam_date) from dual)"
                + "and ts.tid=t.tid "
                + "and e.tid = t.tid "
                + "ORDER BY exam_date DESC";
        
        rset = stmt.executeQuery(query);
        rset.next();
        System.out.println(rset.getString(1));
        rset.previous();
        final int numOfResultColoumn = 3;
        while (rset.next()) {
            result.add(new String[numOfResultColoumn]);
            String row[] = result.get(result.size() - 1);
            for (int i = 0; i < row.length; i++) {
                row[i] = rset.getString(i + 1); //getString-method index starts from 1
            }
        }
        return result;
    }

    public final boolean login(int id, String password) throws SQLException {
        Statement stmt;
        ResultSet rset;
        String query;

        this.getDBConnection();
        stmt = this.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

        final int numOfIdDigits = 5;
        switch (id / (int) Math.pow(10, numOfIdDigits - 1)) {
            case 1:
                query = "SELECT s_password FROM student where sid =" + id;
                break;
            case 3:
                query = "SELECT t_password FROM teacher where tid =" + id;
                break;
            default:
                query = "";
        }

        rset = stmt.executeQuery(query);
        rset.next();
        return rset.getString(1).equals(password);
    }
}

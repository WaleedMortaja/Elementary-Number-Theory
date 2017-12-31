package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

public class DataHandler {

    private final String jdbcUrl = "jdbc:oracle:thin:nt/nt@localhost:1521:xe";
    private Connection conn;

    public DataHandler() throws SQLException {
        this.getDBConnection();
    }

    public final void getDBConnection() throws SQLException {
        OracleDataSource ds;
        ds = new OracleDataSource();
        ds.setURL(this.jdbcUrl);
        this.conn = ds.getConnection();
    }

    /**
     * Get the not graded exams of the student this year
     *
     * @param sid of the student
     * @return 3 coloumns which are: Teacher name , Exam name, Exam date
     * @throws SQLException
     */
    public final ResultSet getAvailableExams(int sid) throws SQLException {
        PreparedStatement ps;
        ResultSet rset;
        String query;

        this.getDBConnection();

        query = "SELECT t.name AS \"Teacher name\", e.name AS \"Exam name\", e.exam_date AS \"Exam date\" FROM teacher t , exam e ,teacher_students ts "
                + "where ts.sid =? "
                + "and ts.study_year = extract(year from e.exam_date) "
                + "and extract (year from sysdate) <= extract(year from e.exam_date) "
                + "and ts.tid=t.tid "
                + "and e.tid = t.tid "
                + " and not exists (select 1 from student_exams se where se.sid=? and se.ename=e.name and se.exam_date = e.exam_date and se.tid = e.tid ) "
                + "ORDER BY e.exam_date ";

        ps = this.conn.prepareStatement(query);
        ps.setInt(1, sid);
        ps.setInt(2, sid);
        rset = ps.executeQuery();

        return rset;
    }

    public final boolean login(int id, String password) throws SQLException, IllegalArgumentException {
        PreparedStatement ps;
        ResultSet rset;
        String query;

        final int numOfIdDigits = 5;
        switch (id / (int) Math.pow(10, numOfIdDigits - 1)) {
            case 1:
                query = "SELECT s_password FROM student where sid =? and s_password=?";
                break;
            case 3:
                query = "SELECT t_password FROM teacher where tid =? and t_password=?";
                break;
            default:
                throw new IllegalArgumentException("Invalid id");
        }

        this.getDBConnection();
        ps = this.conn.prepareStatement(query);
        ps.setInt(1, id);
        ps.setString(2, password);
        rset = ps.executeQuery();

        boolean authenticated = rset.next(); //if there is a result then the username has the correct given password

        if (rset != null) {
            rset.close();
        }

        ps.close();
        conn.close();

        return authenticated;
    }

//    public ResultSet getStudentGrades(int sid) throws SQLException {
//        String query = "";
//        PreparedStatement ps = conn.prepareStatement(query);
//        
//        
//        return result;
//    }
}

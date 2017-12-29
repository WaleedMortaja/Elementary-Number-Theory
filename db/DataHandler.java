package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.pool.OracleDataSource;

public class DataHandler {

    private String jdbcUrl = "jdbc:oracle:thin:nt/nt@localhost:1521:xe";
    private Connection conn;

    public DataHandler() {
    }

    public void getDBConnection() throws SQLException {
        OracleDataSource ds;
        ds = new OracleDataSource();
        ds.setURL(this.jdbcUrl);
        this.conn = ds.getConnection();
    }

    public final ResultSet getAllExams() throws SQLException {
        Statement stmt;
        ResultSet rset;
        String query;

        this.getDBConnection();
        stmt = this.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        query = "SELECT * FROM exam ORDER BY exam_date";
        rset = stmt.executeQuery(query);
        return rset;
    }

    public final boolean login(String id, String password) throws SQLException {
        Statement stmt;
        ResultSet rset;
        String query;
        
        this.getDBConnection();
        stmt = this.conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

        switch (id.charAt(0)) {
            case '1':
                query = "SELECT s_password FROM student where sid =" + id;
                break;
            case '3':
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

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
     * Get the exams of the student in this year. If the students has not
     * applied for an exam, then the grade is returned as null.
     *
     * @param sid of the student
     * @return 4 coloumns which are: Teacher name , Exam name, Exam date , Grade
     * @throws SQLException
     */
    public final ResultSet getExams(int sid) throws SQLException {
        PreparedStatement ps;
        ResultSet rset;
        String query;

        query = "SELECT t.name AS \"Teacher name\", e.name AS \"Exam name\", e.exam_date AS \"Exam date\" , "
                + "(select se.grade from student_exams se where se.sid=? and se.ename = e.name and se.exam_date = e.exam_date and se.tid = e.tid) AS \"Grade\" "
                + "FROM teacher t , exam e ,teacher_students ts "
                + "where ts.sid =? "
                + "and ts.study_year = extract(year from e.exam_date) "
                + "and extract (year from sysdate) <= extract(year from e.exam_date) "
                + "and ts.tid=t.tid "
                + "and e.tid = t.tid "
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

        return authenticated;
    }

//    public ResultSet getStudentGrades(int sid) throws SQLException {
//        String query = "";
//        PreparedStatement ps = conn.prepareStatement(query);
//        
//        
//        return result;
//    }
    public final void closeDBConnection() throws SQLException {
        this.conn.close();
    }

}

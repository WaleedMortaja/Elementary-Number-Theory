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
     * @param student_id of the student
     * @return 4 coloumns which are: Teacher name , Exam name, Exam date , Grade
     * @throws SQLException
     */
    public final ResultSet getExams(int student_id) throws SQLException {
        PreparedStatement ps;
        ResultSet rset;
        String query;

        query = "SELECT t.teacher_name AS \"Teacher name\", e.exam_name AS \"Exam name\", e.exam_date AS \"Exam date\" , "
                + "(select se.grade from student_exams se where se.student_id=? and se.exam_name = e.exam_name and se.exam_date = e.exam_date and se.teacher_id = e.teacher_id) AS \"Grade\" "
                + "FROM teacher t , exam e ,teacher_students ts "
                + "where ts.student_id =? "
                + "and ts.study_year = extract(year from e.exam_date) "
                + "and extract (year from sysdate) <= extract(year from e.exam_date) "
                + "and ts.teacher_id=t.teacher_id "
                + "and e.teacher_id = t.teacher_id "
                + "ORDER BY e.exam_date ";

        ps = this.conn.prepareStatement(query);
        ps.setInt(1, student_id);
        ps.setInt(2, student_id);
        rset = ps.executeQuery();

        // cannt close the PreparedStatement because it will affect ResultSet
        return rset;
    }

    public final boolean login(int id, String password) throws SQLException, IllegalArgumentException {
        PreparedStatement ps;
        ResultSet rset;
        String query;

        final int numOfIdDigits = 5;
        switch (id / (int) Math.pow(10, numOfIdDigits - 1)) {
            case 1:
                query = "SELECT null FROM student where student_id =? and student_password=?";
                break;
            case 3:
                query = "SELECT null FROM teacher where teacher_id =? and teacher_password=?";
                break;
            default:
                throw new IllegalArgumentException("Invalid id");
        }

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

    public void addExam(String exam_name, String exam_date, int teacher_id, int duration) {
        //insert into exam values ('Quiz_1',date '2017-12-30',30001  , 10);
    }

    public final void closeDBConnection() throws SQLException {
        this.conn.close();
    }

}

package db.quiz.quiz04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDAO {
	public static ArrayList<Student> findStudentScoreAndGradeByDeptno(int deptno) {
		ArrayList<Student> studentList = null;
		Connection conn = DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sqlQuery = """
				select s.studno as s1 , s.name as n1 , c.total as t1, h.grade as g1
				from student s
				    inner join score c
				        on s.studno = c.studno
				    inner join hakjum h
				        on c.total between h.min_point and h.max_point
				    where deptno1 = ?
				""";
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			studentList = new ArrayList<Student>();
			while(rs.next()) {
				Student student = new Student();
				student = new Student();
				student.setStudno(rs.getInt("s1"));
				student.setName(rs.getString("n1"));
				//score
				student.setTotal(rs.getString("t1"));
				//hakjum
				student.setScoreGrade(rs.getString("g1"));
				studentList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt, rs);
		}
		return studentList;
	}
}

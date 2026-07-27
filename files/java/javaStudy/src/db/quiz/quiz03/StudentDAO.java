package db.quiz.quiz03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.v3.DBConnectionManager;

public class StudentDAO {
	public static ArrayList<Student> findStudentList() {
		ArrayList<Student> studList = null;
		Connection conn = DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sqlQuery = """
				select studno, name , id 
					   , grade , jumin , to_char(birthday,'yyyy-mm-dd') as birthday
					   , tel , height , weight , deptno1 , deptno2 , profno 
				from student
				""";
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			rs = pstmt.executeQuery();
			studList = new ArrayList<>();
			while(rs.next()) {
				Student student = new Student();
				student.setStudno(rs.getInt("studno"));
				student.setName(rs.getString("name"));
				student.setBirthday(rs.getString("birthday"));;
				student.setId(rs.getString("id"));
				student.setGrade(rs.getInt("grade"));
				student.setJumin(rs.getString("jumin"));
				student.setTel(rs.getString("tel"));
				student.setHeight(rs.getInt("height"));
				student.setWeight(rs.getInt("weight"));
				student.setDeptno1(rs.getInt("deptno1"));
				student.setDeptno2(rs.getInt("deptno2"));
				student.setProfno(rs.getInt("profno"));
				studList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt, rs);
		}
		return studList;
	}
	public static ArrayList<Student> findStudentListbyGrade(int grade){
		ArrayList<Student> studList = null;
		Connection conn = DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sqlQuery = """
				select studno, name , id 
					   , grade , jumin , to_char(birthday,'yyyy-mm-dd') as birthday
					   , tel , height , weight , deptno1 , deptno2 , profno 
				from student
				where grade = ?
				""";
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, grade);
			rs = pstmt.executeQuery();
			studList = new ArrayList<>();
			while(rs.next()) {
				Student student = new Student();
				student.setStudno(rs.getInt("studno"));
				student.setName(rs.getString("name"));
				student.setBirthday(rs.getString("birthday"));
				student.setId(rs.getString("id"));
				student.setGrade(rs.getInt("grade"));
				student.setJumin(rs.getString("jumin"));
				student.setTel(rs.getString("tel"));
				student.setHeight(rs.getInt("height"));
				student.setWeight(rs.getInt("weight"));
				student.setDeptno1(rs.getInt("deptno1"));
				student.setDeptno2(rs.getInt("deptno2"));
				student.setProfno(rs.getInt("profno"));
				studList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt, rs);
		}
		return studList;
	}
	public static int addStudent(Student student) {
		Connection conn = DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		String sqlQuery = """
				insert into student
				values ( ? , ? , ? ,? , ? , to_date(?,'yyyy-mm-dd'), ? ,? ,? ,? ,? ,? )
				""";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, student.getStudno());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getId());
			pstmt.setInt(4, student.getGrade());
			pstmt.setString(5, student.getJumin());
			pstmt.setString(6, student.getBirthday());
			pstmt.setString(7, student.getTel());
			pstmt.setInt(8, student.getHeight());
			pstmt.setInt(9, student.getWeight());
			pstmt.setInt(10, student.getDeptno1());
			pstmt.setInt(11, student.getDeptno2());
			/* if(student.getDeptno2 == null) {  
					pstmt.setNull(11, Types.INTEGER); 
				} else {....}
			// Student에서 int > Integer 변경 후 , nullable하게 만들기. 
			*/
			
			pstmt.setInt(12, student.getProfno());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt);
		}
		return result;
	}
}

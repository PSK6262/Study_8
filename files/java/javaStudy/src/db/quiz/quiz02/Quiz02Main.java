package db.quiz.quiz02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Quiz02Main {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		ArrayList<Professor> profList = findProfessorListByDeptno(101);
		if(profList.size() != 0 && profList != null) {
			for(Professor p : profList) {
				System.out.println(p.toString());
			}
		}
	}
	
	public static ArrayList<Professor> findProfessorListByDeptno(int deptno) {
		Connect();
		ArrayList<Professor> profList = null;
		Professor prof = null;
		
		String sqlQuery = " select profno, name, id, position, pay, deptno from professor where deptno = ? ";
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			profList = new ArrayList<Professor>();
			while(rs.next()) {
				prof = new Professor(rs.getInt("profno"), rs.getString("name"), rs.getString("id"),
											   rs.getString("position"),rs.getInt("pay"),rs.getInt("deptno"));
				profList.add(prof);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Disconnect();
		}
		return profList;
	}
	//임시용
	public static void Connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
		}
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl"; // 127.0.0.1:1521
		String db_id = "scott";
		String db_pw = "tiger";
		
		conn = null;
		pstmt = null;
		rs = null;
		
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void Disconnect() {
		try {
			if(rs != null) 	rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

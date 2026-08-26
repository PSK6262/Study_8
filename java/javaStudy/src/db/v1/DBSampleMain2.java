package db.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBSampleMain2 {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		ArrayList<Dept> deptList = findDept();
		if(deptList.size()==0) {
			System.out.println("데이터 없음");
		}
		else {
			for(Dept d : deptList) {
				System.out.println(d.toString());
			}
		}
	}
	public static ArrayList<Dept> findDept() {
		Connect();
		ArrayList<Dept> deptList = null;
		Dept dept = null;
		String sqlQuery = " select * from dept";
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			rs = pstmt.executeQuery();
			deptList = new ArrayList<>();
			while(rs.next()) {
				dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				deptList.add(dept);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Disconnect();
		}
		return deptList;
	}
	//귀찮아서 임시용
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

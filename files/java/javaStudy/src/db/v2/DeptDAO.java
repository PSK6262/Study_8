package db.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeptDAO {
	// Data Access Object
	public Dept findDeptByDeptno(int deptno) {
		Connection conn = DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sqlQuery = " select * from dept where deptno =  ? "; 
		Dept dept = null;
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery(); // 실행시점
			if(rs.next()) {
				dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt , rs);
		}
		return dept; 
	}
	//select
	public int saveDept3(int dcode , String dname ,int pdept, String area) {
		Connection conn = DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		int result = 0;
		String sqlQuery = " insert into dept3 (dcode,dname,pdept,area) values (? , ? , ? , ?)";
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, dcode);
			pstmt.setString(2, dname);
			pstmt.setInt(3, pdept);
			pstmt.setString(4, area);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt);
		}
		return result;
	}
	public int saveDept(int deptno , String dname ,String loc) {
		Connection conn = DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		int result = 0;
		String sqlQuery = " insert into dept (deptno,dname,loc) values (? , ? , ?)";
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt);
		}
		return result;
	}
	public int saveDept(Dept dept) {
		Connection conn = DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		int result = 0;
		String sqlQuery = " insert into dept (deptno,dname,loc) values (? , ? , ?)";
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt);
		}
		return result;
	}
	//delete
	public int removeDept(int deptno) {
		Connection conn = DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		int result = 0;
		String sqlQuery = " delete from dept where deptno = ? ";
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, deptno);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt);
		}
		return result;
	}
	public int removeDept(Dept dept) {
		return removeDept(dept.getDeptno());
	}
	//Update
	public int modifyDept(Dept dept) {
		Connection conn = DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		int result = 0;
		String sqlQuery = """
				update dept
				set dname = ? , loc = ?
				where deptno = ? 
				""";
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt);
		}
		return result;
	}
}

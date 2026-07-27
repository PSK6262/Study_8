package db.v4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentDAO {
	public static DepartmentDTO findDepartmentByDeptno(int deptno){
		Connection conn = DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sqlQuery = """
				select *
				from department
				where deptno = ?
				""";
		DepartmentDTO department = null;
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			department = new DepartmentDTO();
			if(rs.next()) {
				department.setDeptno(rs.getString("deptno"));
				department.setDname(rs.getString("dname"));
				department.setPart(rs.getString("part"));
				department.setBuild(rs.getString("build"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt, rs);
		}
		return department;
	}
}

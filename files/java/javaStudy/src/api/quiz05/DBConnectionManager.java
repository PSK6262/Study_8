package api.quiz05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectionManager {
	public static Connection connectDB() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
		}
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl"; // 127.0.0.1:1521
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static void disconnectDB(Connection conn , PreparedStatement pstmt, ResultSet rs) {
		try {
			if(conn != null) conn.close();
			if(pstmt!= null) pstmt.close();
			if(rs!= null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void disconnectDB(Connection conn , PreparedStatement pstmt) {
		try {
			if(conn != null) conn.close();
			if(pstmt!= null) pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

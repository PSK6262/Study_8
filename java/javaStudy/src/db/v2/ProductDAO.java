package db.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAO {
	public static Product findProductByPCode(int p_code) {
		Connection conn = 	DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Product product = null;
		String sqlQuery = " select * from product where p_code = ? ";
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, p_code);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				product = new Product(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt, rs);
		}
		return product;
	}
	public static ArrayList<Product> findProductAll() {
		Connection conn = 	DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Product product = null;
		ArrayList<Product> productList = null;
		String sqlQuery = " select * from product";
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			rs = pstmt.executeQuery();
			productList = new ArrayList<>();
			while(rs.next()) {
				product = new Product(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));
				productList.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt, rs);
		}
		return productList;
	}
}

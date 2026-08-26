package db.quiz.quiz01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Quiz01Main {
	static Connection conn = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	
	public static void main(String[] args) {
		Product product = findProductByPCode(100);
		System.out.println(product.toString());

		System.out.println("---------------------");
		
		ArrayList<Product> productList = findProductAll();
		for(Product p : productList) {
			System.out.println(p.toString());
		}
	}
	public static Product findProductByPCode(int p_code) {
		Connect();
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
			Disconnect();
		}
		return product;
	}
	public static ArrayList<Product> findProductAll() {
		Connect();
		ArrayList<Product> productList = null;
		Product product = null;
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
			Disconnect();
		}
		return productList;
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

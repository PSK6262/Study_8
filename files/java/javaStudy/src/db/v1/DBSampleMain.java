package db.v1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DBSampleMain {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.print("SELECT * FROM DEPT WHERE DEPTNO = ");
		//int deptno = scan.nextInt();
		//findDeptByDeptnoPrint(deptno);
		//Dept dept = findDeptByDeptno(deptno);
		System.out.print("SELECT * FROM DEPT WHERE DNAME = ");
		String dname = scan.nextLine();
		Dept dept = findDeptByDname(dname);
		try {
			System.out.print(dept.toString());
		} catch (Exception e) {
			System.out.println("검색 결과 없음");
		}
		
	}
	// select * from dept;
	public static void findDept() {
		Connect();
		String sqlQuery = " select * from dept ";
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("deptno") + " ");
				System.out.print(rs.getString("dname") + " ");
				System.out.println(rs.getString("loc"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Disconnect();
	}
	public static void findDeptWhere() {
		Connect();
		String sqlQuery = " select * from dept where deptno = 10  ";
		
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			
			rs = pstmt.executeQuery(); //실행시점
			
			while(rs.next()) {
				System.out.print(rs.getInt("deptno") + " ");
				System.out.print(rs.getString("dname") + " ");
				System.out.println(rs.getString("loc"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Disconnect();
	}
	public static void findDeptByDeptnoPrint(int deptno) {
		Connect();
		String sqlQuery = " select * from dept where deptno =  ? "; 
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery(); // 실행시점
			
			while(rs.next()) {
				System.out.print(rs.getInt("deptno") + " ");
				System.out.print(rs.getString("dname") + " ");
				System.out.println(rs.getString("loc"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		Disconnect();
	}
	public static Dept findDeptByDeptno(int deptno) {
		Connect();
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
		} catch (InputMismatchException e) {
			e.printStackTrace();
		}
		Disconnect();
		return dept; 
	}
	public static Dept findDeptByDname(String dname) {
		Connect();
		String sqlQuery = " select * from dept where dname =  ? "; 
		Dept dept = null;
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setString(1, dname.toUpperCase());
			rs = pstmt.executeQuery(); // 실행시점
			if(rs.next()) { //지금은 한개만 나온다는걸 알지만 dname이 같은 곳이 있을 수 있음.
				dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Disconnect();
		return dept; 
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

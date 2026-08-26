package db.v3;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProfessorDAO {
	public void findProfessorList() {
	
		ArrayList<ProfessorDTO> profList = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sqlQuery = """
				select profno
					   , name 
					   , id 
					   , hiredate 
				from professor 
				""";
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			rs = pstmt.executeQuery();
			profList = new ArrayList<>();
			while(rs.next()) {
				ProfessorDTO professor = new ProfessorDTO();
				professor.setProfno( rs.getInt("profno"));
				professor.setName( rs.getString("name"));
				professor.setId( rs.getString("id"));
				profList.add(professor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, pstmt, rs);
		}
	}
}

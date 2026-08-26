package api.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MidFcstDAO {
	public int saveMidTa(MidTaDTO midTaDTO) {
		Connection conn = DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sqlQuery = """
					insert into mid_ta values (? , ? , ? , ? , ? , ?)
				""";
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setString(1,midTaDTO.getTmFc());
			pstmt.setString(2,midTaDTO.getRegId());
			pstmt.setInt(3, midTaDTO.getTaMin4());
			pstmt.setInt(4, midTaDTO.getTaMax4());
			pstmt.setInt(5, midTaDTO.getTaMin5());
			pstmt.setInt(6, midTaDTO.getTaMax5());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			
		}  finally {
			DBConnectionManager.disconnectDB(conn, pstmt);
		}
		return result;
	}
}

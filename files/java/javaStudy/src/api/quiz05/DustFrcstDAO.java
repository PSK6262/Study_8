package api.quiz05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import api.v2.DBConnectionManager;

public class DustFrcstDAO {
	public int saveDustFrcst(ResponseDTO response) {
		Connection conn = DBConnectionManager.connectDB();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sqlQuery = """
					insert into DustFrcst values (? , ? , ? , ? , ? , ? , ? , ? , ?)
				""";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sqlQuery);
			pstmt.setString(1, response.getHeader().getResultCode());
			pstmt.setString(2, response.getHeader().getResultMsg());
			pstmt.setInt(3, response.getBody().getNumOfRows());
			pstmt.setInt(4, response.getBody().getPageNo());
			pstmt.setInt(5, response.getBody().getTotalCount());
			pstmt.setString(6, response.getBody().getItems().get(0).getDataTime()); // 좋지않으나 일단 그냥 get(0)으로.
			pstmt.setString(7, response.getBody().getItems().get(0).getInformCode()); // DB에서 외래키로 테이블 하나
			pstmt.setString(8, response.getBody().getItems().get(0).getInformOverall()); // 빼면 조금 깔끔하게 바꿀 수 있음
			pstmt.setString(9, response.getBody().getItems().get(0).getImageUrl());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
			DBConnectionManager.disconnectDB(conn, pstmt);
		}
		return result;
	}
}

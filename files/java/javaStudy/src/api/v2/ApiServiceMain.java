package api.v2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApiServiceMain {

	public static void main(String[] args) {
		MidFcstInfoSeviceRepository repo = new MidFcstInfoSeviceRepository();

		//시간, 지역코드 전달 -> api요청 -> 응답 -> json parsing -> dto 변환
		MidTaDTO m1 = repo.getMidTa("202607290600", "11B10101");
		System.out.println(m1); // dto 확인
		MidTaDTO m2 = repo.getMidTa("202607290600", "11B20201");
		System.out.println(m2);
		
		MidFcstDAO midFcstDAO = new MidFcstDAO();
		
		int r1 = midFcstDAO.saveMidTa(m1);
		if(r1 >0) System.out.println("m1 ok");
		int r2 = midFcstDAO.saveMidTa(m2);
		if(r2 >0) System.out.println("m2 ok");
	}
}

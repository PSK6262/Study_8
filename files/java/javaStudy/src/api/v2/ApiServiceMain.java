package api.v2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApiServiceMain {

	public static void main(String[] args) {
		MidFcstInfoSeviceRepository repo = new MidFcstInfoSeviceRepository();

		//시간, 지역코드 전달 -> api요청 -> 응답 -> json parsing -> dto 변환
		MidTaDTO m1 = repo.getMidTa("202607280600", "11B10101");
		System.out.println(m1); // dto 확인
		MidTaDTO m2 = repo.getMidTa("202607280600", "11B20201");
		System.out.println(m2);
	}
}

package api.quiz02;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import api.v2.MidTaDTO;

public class ApiQuiz2Main {

	public static void main(String[] args) {
		String jsonString = ""
				+ "{"
				+ "\"도서관\": {"
				+ "\"위치\": \"서울특별시 강남구\","
				+ "\"운영시간\": {"
				+ "\"평일\": [\"09:00\", \"21:00\"],"
				+ "\"주말\": [\"10:00\", \"18:00\"]"
				+ "},"
				+ "\"책목록\": ["
				+ "{"
				+ "\"제목\": \"자바 프로그래밍\","
				+ "\"저자\": \"홍길동\","
				+ "\"출판연도\": 2023,"
				+ "\"가격\": 25000,"
				+ "\"대출가능\": true,"
				+ "\"카테고리\": [\"프로그래밍\", \"자기계발\"]"
				+ "},"
				+ "{"
				+ "\"제목\": \"데이터 분석 입문\","
				+ "\"저자\": \"김철수\","
				+ "\"출판연도\": 2022,"
				+ "\"가격\": 28000,"
				+ "\"대출가능\": false,"
				+ "\"카테고리\": [\"데이터\", \"분석\"]"
				+ "}"
				+ "],"
				+ "\"특별서비스\": {"
				+ "\"키오스크\": true,"
				+ "\"스터디룸\": {"
				+ "\"개수\": 5,"
				+ "\"예약 가능\": true,"
				+ "\"비용\": {"
				+ "\"1시간당\": 5000,"
				+ "\"하루\": 30000"
				+ "}"
				+ "}"
				+ "}"
				+ "}"
				+ "}";
		
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonString);
			JSONObject library = (JSONObject)jsonObj.get("도서관");
			JSONObject specialService = (JSONObject)library.get("특별서비스");
			JSONObject openTime = (JSONObject)library.get("운영시간");
			JSONObject studyRoom = (JSONObject)specialService.get("스터디룸");
			
			JSONArray bookCatalog = (JSONArray)library.get("책목록");
			
			String location = library.get("위치").toString();
			String openTimeNW = openTime.get("평일").toString();
			String openTimeW = openTime.get("주말").toString();
			System.out.println(library);
			System.out.println(specialService);
			System.out.println(openTime);
			System.out.println(studyRoom);
			System.out.println("-------------");
			System.out.println(location);
			System.out.println(openTimeNW);
			System.out.println(openTimeW);
			System.out.println(bookCatalog.get(0));
			System.out.println(bookCatalog.get(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

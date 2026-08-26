package api.quiz03;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class ApiQuiz03Main {

	public static void main(String[] args) {
		String jsonString = "{"
				+ "\"employees\": ["
				+ "{"
				+ "\"id\": 1,"
				+ "\"name\": \"홍길동\","
				+ "\"position\": \"개발자\","
				+ "\"salary\": 50000,"
				+ "\"skills\": [\"Java\", \"Python\", \"SQL\"]"
				+ "},"
				+ "{"
				+ "\"id\": 2,"
				+ "\"name\": \"김철수\","
				+ "\"position\": \"디자이너\","
				+ "\"salary\": 40000,"
				+ "\"skills\": [\"Photoshop\", \"Illustrator\"]"
				+ "}"
				+ "],"
				+ "\"company\": {"
				+ "\"name\": \"주식회사 ABC\","
				+ "\"address\": \"서울시 강남구\","
				+ "\"established\": \"1990-01-01\","
				+ "\"departments\": ["
				+ "{"
				+ "\"name\": \"개발부\","
				+ "\"employees\": [1, 3, 5]"
				+ "},"
				+ "{"
				+ "\"name\": \"디자인부\","
				+ "\"employees\": [2, 4]"
				+ "}"
				+ "]"
				+ "},"
				+ "\"projects\": ["
				+ "{"
				+ "\"title\": \"사내 시스템 개발\","
				+ "\"budget\": 100000,"
				+ "\"team\": [1, 3]"
				+ "},"
				+ "{"
				+ "\"title\": \"웹 디자인 프로젝트\","
				+ "\"budget\": 80000,"
				+ "\"team\": [2, 4]"
				+ "}"
				+ "]"
				+ "}";
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject)jsonParser.parse(jsonString);
			JSONArray projects = (JSONArray)jsonObject.get("projects");
			JSONObject company = (JSONObject)jsonObject.get("company");
			JSONArray employees = (JSONArray)jsonObject.get("employees");
			JSONObject project_1 = (JSONObject)projects.get(0);
			JSONObject project_2 = (JSONObject)projects.get(1);
			System.out.println(projects);
			System.out.println(company);
			System.out.println(employees);
			JSONObject emp = (JSONObject)employees.get(0);
			System.out.println(employees.get(0));
			System.out.println(emp.get("name"));
			System.out.println(emp.get("position"));
			System.out.println(emp.get("salary"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

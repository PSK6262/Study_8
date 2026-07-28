package api.v1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ApiServiceMain {

	public static void main(String[] args) {
		MidFcstInfoSeviceRepository repo = new MidFcstInfoSeviceRepository();
		try {
			//계속 Request 하지 말고 나온값 쓰기 (임시)
			//String jsonString = repo.requestApi_getMidTa();
			String jsonString = "{\"response\":{\"header\":{\"resultCode\":\"00\",\"resultMsg\":\"NORMAL_SERVICE\"},\"body\":{\"dataType\":\"JSON\",\"items\":{\"item\":[{\"regId\":\"11B10101\",\"taMin4\":26,\"taMin4Low\":1,\"taMin4High\":1,\"taMax4\":33,\"taMax4Low\":1,\"taMax4High\":1,\"taMin5\":25,\"taMin5Low\":1,\"taMin5High\":1,\"taMax5\":34,\"taMax5Low\":1,\"taMax5High\":1,\"taMin6\":25,\"taMin6Low\":1,\"taMin6High\":1,\"taMax6\":35,\"taMax6Low\":1,\"taMax6High\":1,\"taMin7\":26,\"taMin7Low\":1,\"taMin7High\":1,\"taMax7\":35,\"taMax7Low\":1,\"taMax7High\":1,\"taMin8\":26,\"taMin8Low\":0,\"taMin8High\":1,\"taMax8\":35,\"taMax8Low\":0,\"taMax8High\":1,\"taMin9\":25,\"taMin9Low\":0,\"taMin9High\":1,\"taMax9\":35,\"taMax9Low\":0,\"taMax9High\":1,\"taMin10\":25,\"taMin10Low\":0,\"taMin10High\":1,\"taMax10\":35,\"taMax10Low\":0,\"taMax10High\":1}]},\"pageNo\":1,\"numOfRows\":10,\"totalCount\":1}}}\r\n";
			// parsing
			/*
			 * 최초 : parsing 객체 JSONParser() parse()
			 * { } : JSONObject
			 * [ ] : JSONArray
			 * key : value -> get("key값");
			 * */
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonString);
			JSONObject response = (JSONObject)jsonObj.get("response");
			JSONObject header = (JSONObject)response.get("header");
			System.out.println(header.get("resultCode"));
			System.out.println(header.get("resultMsg"));
			
			JSONObject body = (JSONObject)response.get("body");

			System.out.println(body.get("dataType"));
			System.out.println(body.get("pageNO"));
			System.out.println(body.get("numOfRows"));
			System.out.println(body.get("totalCount"));
			
			JSONObject items = (JSONObject)body.get("items");
			JSONArray item = (JSONArray)items.get("item");
			// { [],[],[],[],[] }
			System.out.println("item : " + item.get(0));
			JSONObject item0 = (JSONObject)item.get(0);
			System.out.println(item0.get("regId"));
			System.out.println(item0.get("taMin4"));
			System.out.println(item0.get("taMin5"));
			System.out.println(item0.get("taMax4"));
			System.out.println(item0.get("taMax5"));
			
			//--------------------------------------------------------------------
			MidTaDTO midTaDTO = new MidTaDTO();
			midTaDTO.setResultCode(header.get("resultCode").toString());
			midTaDTO.setResultMsg(header.get("resultMsg").toString());
			
			midTaDTO.setTmFc("202607280600");
			midTaDTO.setRegId(item0.get("regId").toString());
			midTaDTO.setTaMax4(((Number)item0.get("taMax4")).intValue());
			midTaDTO.setTaMin4(Integer.parseInt(item0.get("taMin4").toString()));
			midTaDTO.setTaMin5(((Number)item0.get("taMin5")).intValue());
			midTaDTO.setTaMax5(((Number)item0.get("taMax5")).intValue());			
			
			System.out.println(midTaDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package api.v2;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
public class MidFcstInfoSeviceRepository {
	/*
	 * 중기 기온 조회
	 * https://www.data.go.kr/data/15059468/openapi.do
	 * 요청주소 http://apis.data.go.kr/1360000/MidFcstInfoService/getMidTa
	 * 서비스URL http://apis.data.go.kr/1360000/MidFcstInfoService
	 */
	public String requestApi_getMidTa(String tmFc, String regId) throws Exception {
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1360000/MidFcstInfoService/getMidTa"); /*URL*/
	    urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=5f36fd52ce1706243163d01d3caa8ee3e689f1a5d3a6a4b6e3cdc9e4b373ff88"); /*Service Key*/
	    urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
	    urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
	    urlBuilder.append("&" + URLEncoder.encode("dataType","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*요청자료형식(XML/JSON)Default: XML*/
	    urlBuilder.append("&" + URLEncoder.encode("regId","UTF-8") + "=" + URLEncoder.encode(regId, "UTF-8")); /*11B10101 서울, 11B20201 인천 등 ( 별첨엑셀자료 참고)*/
	    urlBuilder.append("&" + URLEncoder.encode("tmFc","UTF-8") + "=" + URLEncoder.encode(tmFc, "UTF-8")); /*-일 2회(06:00,18:00)회 생성 되며 발표시각을 입력- YYYYMMDD0600(1800) 최근 24시간 자료만 제공*/
	    URL url = new URL(urlBuilder.toString());
	    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	    conn.setRequestMethod("GET");
	    conn.setRequestProperty("Content-type", "application/json");
	    System.out.println("Response code: " + conn.getResponseCode());
	    BufferedReader rd;
	    if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	        rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	    } else {
	        rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	    }
	    StringBuilder sb = new StringBuilder();
	    String line;
	    while ((line = rd.readLine()) != null) {
	        sb.append(line);
	    }
	    rd.close();
	    conn.disconnect();
	    return sb.toString();
	}
	public MidTaDTO getMidTa(String tmFc , String regId) {
		MidTaDTO midTaDTO = null;
		try {
			String jsonString = requestApi_getMidTa(tmFc , regId);
			//String jsonString = "{\"response\":{\"header\":{\"resultCode\":\"00\",\"resultMsg\":\"NORMAL_SERVICE\"},\"body\":{\"dataType\":\"JSON\",\"items\":{\"item\":[{\"regId\":\"11B10101\",\"taMin4\":26,\"taMin4Low\":1,\"taMin4High\":1,\"taMax4\":33,\"taMax4Low\":1,\"taMax4High\":1,\"taMin5\":25,\"taMin5Low\":1,\"taMin5High\":1,\"taMax5\":34,\"taMax5Low\":1,\"taMax5High\":1,\"taMin6\":25,\"taMin6Low\":1,\"taMin6High\":1,\"taMax6\":35,\"taMax6Low\":1,\"taMax6High\":1,\"taMin7\":26,\"taMin7Low\":1,\"taMin7High\":1,\"taMax7\":35,\"taMax7Low\":1,\"taMax7High\":1,\"taMin8\":26,\"taMin8Low\":0,\"taMin8High\":1,\"taMax8\":35,\"taMax8Low\":0,\"taMax8High\":1,\"taMin9\":25,\"taMin9Low\":0,\"taMin9High\":1,\"taMax9\":35,\"taMax9Low\":0,\"taMax9High\":1,\"taMin10\":25,\"taMin10Low\":0,\"taMin10High\":1,\"taMax10\":35,\"taMax10Low\":0,\"taMax10High\":1}]},\"pageNo\":1,\"numOfRows\":10,\"totalCount\":1}}}\r\n";
			
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(jsonString);
			JSONObject response = (JSONObject)jsonObj.get("response");
			JSONObject header = (JSONObject)response.get("header");
			JSONObject body = (JSONObject)response.get("body");
			JSONObject items = (JSONObject)body.get("items");
			JSONArray item = (JSONArray)items.get("item");
		
			JSONObject item0 = (JSONObject)item.get(0);
			
			midTaDTO = new MidTaDTO();
			midTaDTO.setResultCode(header.get("resultCode").toString());
			midTaDTO.setResultMsg(header.get("resultMsg").toString());
			
			midTaDTO.setTmFc(tmFc);
			midTaDTO.setRegId(regId);
			midTaDTO.setTaMax4(((Number)item0.get("taMax4")).intValue());
			midTaDTO.setTaMin4(Integer.parseInt(item0.get("taMin4").toString()));
			midTaDTO.setTaMin5(((Number)item0.get("taMin5")).intValue());
			midTaDTO.setTaMax5(((Number)item0.get("taMax5")).intValue());			
			
			//System.out.println(midTaDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return midTaDTO;
	}
}

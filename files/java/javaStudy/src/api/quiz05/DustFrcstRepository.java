package api.quiz05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DustFrcstRepository {
	public String getMinuDustFrcstDspthByDate(String date) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=5f36fd52ce1706243163d01d3caa8ee3e689f1a5d3a6a4b6e3cdc9e4b373ff88"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("returnType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*xml 또는 json*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8")); /*한 페이지 결과 수(조회 날짜로 검색 시 사용 안함)*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호(조회 날짜로 검색 시 사용 안함)*/
        urlBuilder.append("&" + URLEncoder.encode("searchDate","UTF-8") + "=" + URLEncoder.encode(date, "UTF-8")); /*통보시간 검색(조회 날짜 입력이 없을 경우 한달동안 예보통보 발령 날짜의 리스트 정보를 확인)*/
        urlBuilder.append("&" + URLEncoder.encode("InformCode","UTF-8") + "=" + URLEncoder.encode("PM10", "UTF-8")); /*통보코드검색(PM10, PM25, O3)*/
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
	public ResponseDTO getResponseFromDustFrcstByDate(String date) {
    	ResponseDTO responseDTO = new ResponseDTO();
    	try {
        	String jsonString = getMinuDustFrcstDspthByDate(date);
    		JSONParser jsonParser = new JSONParser();
        	JSONObject jsonObject = (JSONObject)jsonParser.parse(jsonString);
        	JSONObject response = (JSONObject)jsonObject.get("response");
        	JSONObject body = (JSONObject)response.get("body");
        	JSONObject header = (JSONObject)response.get("header");
        	
        	BodyDTO bodyDTO = new BodyDTO();
        	String totalCount = body.get("totalCount").toString();
        	String pageNo = body.get("pageNo").toString();
        	String numOfRows = body.get("numOfRows").toString();
        	
        	JSONArray tempItems = (JSONArray)body.get("items");
        	ArrayList<ItemsDTO> items = new ArrayList<>();
        	for(int i=0;i<tempItems.size();i++) {
        		JSONObject ItemsObj = (JSONObject)tempItems.get(i);
        		ItemsDTO itemsDTO = new ItemsDTO();
        		if(ItemsObj.get("imageUrl1") == null) itemsDTO.setImageUrl(null);
        		else itemsDTO.setImageUrl(ItemsObj.get("imageUrl1").toString());
        		itemsDTO.setDataTime(ItemsObj.get("dataTime").toString());
        		itemsDTO.setInformOverall(ItemsObj.get("informOverall").toString());
        		itemsDTO.setInformCode(ItemsObj.get("informCode").toString());
        		items.add(itemsDTO);
        	}
        	bodyDTO.setTotalCount(Integer.parseInt(totalCount));
        	bodyDTO.setPageNo(Integer.parseInt(pageNo));
        	bodyDTO.setNumOfRows(Integer.parseInt(numOfRows));
        	bodyDTO.setItems(items);
        	
        	HeaderDTO headerDTO = new HeaderDTO();
        	String resultMsg = header.get("resultMsg").toString();
        	String resultCode = header.get("resultCode").toString();
        	headerDTO.setResultCode(resultCode);
        	headerDTO.setResultMsg(resultMsg);
        	
        	responseDTO.setBody(bodyDTO);
        	responseDTO.setHeader(headerDTO);      
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return responseDTO;
	}
}

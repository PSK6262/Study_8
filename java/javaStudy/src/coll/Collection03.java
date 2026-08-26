package coll;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Collection03 {

	public static void main(String[] args) {
		//Map
		
		Map<Integer, String> map1 = new HashMap<>();
		// map 추가 put
		// map 조회 get ( key값으로 )
		map1.put(1,"하나");
		map1.put(2,"둘");
		map1.put(3,"셋");
		map1.put(4,"넷");
		// map 삭제 remove(key값)
		map1.remove(4);
		
		System.out.println(map1.size());
		System.out.println(map1.containsKey(2));
		System.out.println(map1.containsValue("다섯"));

		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("규칙1", "지각안하기");
		map2.put("규칙2", "결석안하기");
		map2.put("공지", "평가날안빠지기");

		System.out.println(map2.size());
		System.out.println(map2.containsKey("공지"));
		System.out.println(map2.containsValue("평가날빠지기"));
		
		// map 값 접근
		// keySet
		
		for(int k : map1.keySet()) {
			System.out.println("key : "+k);
		}
		for(String k : map2.keySet()) {
			System.out.println("key : "+k);
		}
		
		System.out.println("----------------");
		for(String v : map1.values()) {
			System.out.println(v);
		}
		for(String v : map2.values()) {
			System.out.println(v);
		}
		
		System.out.println("------ key로 접근 value 출력");
		for(String key : map2.keySet()) {
			System.out.println("key : " + key + " " + "value : " + map2.get(key) );
		}
		System.out.println("-------");
		//map2.entrySet(); 
		for(Entry<String, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		Map<String, Temp> map3 = new HashMap<String, Temp>();
		map3.put("좌표1", new Temp(100,200));
		Temp t1 = new Temp(300, 400);
		map3.put("옆집", t1);
		
		for(String key : map3.keySet()) {
			System.out.println(key + " : " + map3.get(key));
			System.out.println(key + " : " + map3.get(key).getX() + " , " + map3.get(key).getY());
		}
	}
}
class Temp {
	private int x;
	private int y;
	
	public Temp() {}
	public Temp(int x, int y) {
		super();
		this.setX(x);
		this.setY(y);
	}
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	@Override
	public String toString() {
		return "Temp [x=" + x + ", y=" + y + "]";
	}
	
}


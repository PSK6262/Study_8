package exp;

import java.util.ArrayList;
import java.util.List;

public class Exp03 {
	public static void main(String[] args) {
		SampleEx se = new SampleEx();
		try {
			se.addItem1("하나");
		} catch (Exception e) {
			System.out.println("addItem1 호출 실패");
		}
		se.addItem2("둘"); // 여기에 try-catch를 추가해도 의미 X , addItem2에서 처리되었기 때문
		try {
			se.addItem3("셋"); // 무조건 해 줘야함.(try-catch의무)
		} catch (Exception e) {
			System.out.println("addItem3 호출 실패");
		}
		try {
			se.addItem4("넷"); // NullPointerException => RuntimeException , 빨간줄 없음. 실행전까지 모름
		} catch (NullPointerException e) {
			System.out.println("addItem4 호출 실패");
		}
		try {
			se.addItem5("다섯");
		} catch (Exception e) {
			System.out.println("addItem5 호출 실패");
		}
		try {
			se.addItem6("여섯");
		} catch (Exception e) {
			System.out.println("addItem6 호출 실패");
		}
		int result = se.addItem7("일곱");
		if(result == 1) System.out.println("addItem7 정상처리");
		else System.out.println("addItem7 예외발생");
		se.showList();
		se.addItem8("여덟");
		try {
			se.addItem9("아홉");
		} catch (ListFullException e) {
			e.printStackTrace();
			System.out.println("ListFullException");
		} catch (InvalidParameterValueException e) {
			System.out.println("InvalidParameterValueException");
			e.printStackTrace();
		}
		se.showList();
		
	}
}

class SampleEx {
	List<String> list;
	//list = new ArrayList<String>();
	void addItem1(String s) {
		list.add(s);
	}
	void addItem2(String s) {
		try {
			list.add(s);
		} catch (Exception e) {
			System.out.println("SampleEx 안의 addItem2 try-catch");
		}
	}
	void addItem3(String s) throws Exception {
		list.add(s);
	}
	void addItem4(String s) throws NullPointerException {
		list.add(s);
	}
	void addItem5(String s) throws Exception {
		try {
			list.add(s);
		} catch (Exception e) {
			System.out.println("SampleEx 내부 addItem5 try-catch");
		}
	}
	void addItem6(String s) throws Exception {
		try {
			list.add(s);
		} catch (Exception e) {
			System.out.println("SampleEx 내부 addItem5 try-catch");
			throw e;
		}
	}
	int addItem7(String s) {
		try {
			list.add(s);
		} catch (Exception e) {
			return -1;
		}
		return 1;
	}
	void addItem8(String s) { // 직접해결
		try {
			list.add(s);
		} catch (Exception e) {
			if(list == null) {
				list = new ArrayList<>();
				list.add(s);
			}
		}
	}
	void addItem9(String s) throws ListFullException, InvalidParameterValueException {
		try {
			list.add(s);
		} catch (Exception e) {
			throw new ListFullException();
		}
	}
	void showList() {
		System.out.println("--start--");
		if(list != null) {
			for(String s : list) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		System.out.println("---end---");
	}
}

/* Custom Exception */
class ListFullException extends Exception {}
class InvalidParameterValueException extends Exception {}
class SuperHungryException extends Exception {}
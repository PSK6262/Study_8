package be_study.cls.cls05;

public class Galaxy {
	
	//필드변수
	
	//인스턴스 멤버 -> 각 인스턴스 객체가 독립적/개별적 으로 가지고 있는 변수
	String owner; //소유주
	String model; //상세모델  25 26 26plus 
	
	//정적 멤버 -> static 변수
	static String madeBy = "삼성";
	//객체 생성안해도 이미 존재
	// 클래스에서 공통으로 사용
	//		(각 객체가 접근해도 같은 값에 접근)
	//		(각 객체별로 가지고 있을 필요 없는)
	
	//메소드
	// 인스턴스 메소드
	void showInfo() {  //가지고있는 정보 출력
		System.out.println(owner + " 님의 " + model + " 상품 입니다.");
		System.out.println("저는 " + madeBy + " 에서 만들어졌어요.");
	}
	
	// 정적 메소드
	static void showMadeBy() {
		//static 메소드 -> static 멤버 변수   접근 가능
		System.out.println(madeBy + " 에서 만든 갤럭시 상품입니다.");
		
		//System.out.println("저는 " + owner + " 님의 상품이요~");
		// static 메소드에서는 일반 인스턴스 멤버 변수에는 접근이 불가능
	}
	
}

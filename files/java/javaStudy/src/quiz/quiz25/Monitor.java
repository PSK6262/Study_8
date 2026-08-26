package quiz.quiz25;

public class Monitor {
	
	//클래스명 대문자

	//모니터 클래스 생성
	
	
//	*속성
//	인치수(int타입)
//	제조사(String타입)
//	모델명(String타입)
	
	int inch; 
	String company; 
	String model;
	
//
//	*생성자
//	매개변수로 3개를 모두 받아서 저장하는 생성자

	//Monitor(){}
	
	Monitor(int inch, String company, String model){
		this.inch = inch;
		this.company = company;
		this.model = model;
	}
	
//	*메소드
//	가지고 있는 3개의 정보를 출력하는 printInfo 메소드 생성
	void printInfo() {  //  객체.printInfo();

		//제조사:삼성 모델명:더프레임 인치:65인치
		System.out.printf("제조사:%s 모델명:%s 인치:%d인치\n", company, model, inch);
	}
	
	
	//  객체.printInfo(40, "회사", "모델명");
//	void printInfo(int inch, String company, String model) {  
//
//		//제조사:삼성 모델명:더프레임 인치:65인치
//		System.out.printf("제조사:%s 모델명:%s 인치:%d인치\n", company, model, inch);
//	}
	
}


















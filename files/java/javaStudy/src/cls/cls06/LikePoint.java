package be_study.cls.cls06;

public class LikePoint {

	//상수형 변수 -> 기준값 상태값
	// 코드표 (공통코드)
	
	//static final 상수형 변수명은 -> 모두 대문자로 표현   _ 구분
	static final int VERY_GOOD = 5;
	static final int GOOD = 4;
	static final int NORMAL = 3;
	static final int BAD = 2;
	static final int VERY_BAD = 1;
					//myPcOptionTest
	// abc : 변수명
	// Abc : 클래스명
	// abcArr : 배열변수명
	// abc() : 메소드
	// ABC : 상수형변수명
	
	
	//-------------
	
	static int staticX = 1;
	final int finalX = 5;  //final 초기화 필요
	
	final String category; 
	
	LikePoint(){
		category = null; 
	}
	
	LikePoint(String category){   
		this.category = category; //final 생성자에서라도 초기화 필요
	}  
}

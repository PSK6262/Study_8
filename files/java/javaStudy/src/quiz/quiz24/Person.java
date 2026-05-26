package quiz.quiz24;

public class Person {
	//사람 클래스
	

	//필드

	String name; //	이름
	String gender;// 성별  남/여 male/female M/F man/woman boy/girl
	//int gender;   // 1 2   1:남자 2:여자
	int age; //	나이
	double height; //	키
	double weight; //	몸무게
	String job; //	직업
	String bloodType; // 혈액형 A B O AB  Rh- Rh+ 
					  // "Rh-A"   "+B" ...
	//boolean isHealthy; //	건강상태
					// true 건강  false 안건강
	String healthState; //건강함 안건강함
			// 매우좋음 좋음 보통 나쁨 매우나쁨
			// static fianl 상수형 , enum 
	//int ...  1 ~ 10    10 제일 건강
	
	boolean isSleeping; //	수면중여부
				//true 자는중 false 안자는중
	
	//생성자
	Person() {} //기본생성자
	
	Person(String name, int age, double height, boolean isSleeping) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.isSleeping = isSleeping;
	}
}

package quiz.quiz26;

public class ExrMain {

	public static void main(String[] args) {

		// TV 클래스 
					//   TV 생성자(매개변수 3개) 
		TV myTv = new TV("LG", 2021, 43);
		myTv.show();
		
		//TV 클래스 내부에 show() 메소드 존재
		// 리턴X void , 매개변수X show() 
		
		//LG제품 2021년형 43인치 TV
		
		TV myTv2 = new TV("삼성", 2025, 150);
		myTv2.show();
	}
}
package quiz.quiz26;

public class Circle {

	int radius; // 반지름 저장용   필드변수
	
//	Circle(){
//	}
	
	void setRadius(int radius) {
		this.radius = radius;
	}
	
	double getArea(){
		// 원 넓이 : 반지름 * 반지름 * 3.14
		
		double area = radius * radius * 3.14;
		return area;
//		return radius * radius * 3.14;
	}
}

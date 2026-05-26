package quiz.quiz26;

public class Triangle {
//	double width; 
//	double height;
//	
//	void setSize(double width, double height) {
//		this.width = width;
//		this.height = height;
//	}
	
	int width;  //밑변
	int height; //높이
	
	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return (double)width * height / 2.0;
		
		//return 타입 
		//해당 타입 변수 = 저장 가능한 값
		// double 변수 = double 값
		// double 변수 = int 값
	}
	
	
}

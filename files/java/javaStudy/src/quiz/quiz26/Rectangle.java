package quiz.quiz26;

public class Rectangle {

	int width; //밑변
	int height; //높이
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		// 사각형 : 밑변 * 높이
		return width * height;
	}
}

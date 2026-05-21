package cls.cls_quiz03;

public class Rectangle {
	private double width;
	private double height;
	
	Rectangle(){}
	Rectangle(double width,double height){
		this.setWidth(width);
		this.setHeight(height);
	}
	double getArea() {
		return width*height;
	}
	double getHeight() {
		return height;
	}
	void setHeight(double height) {
		this.height = height;
	}
	double getWidth() {
		return width;
	}
	void setWidth(double width) {
		this.width = width;
	}
	
}

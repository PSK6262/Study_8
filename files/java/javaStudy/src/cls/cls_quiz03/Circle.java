package cls.cls_quiz03;

public class Circle {
	private double radius;

	Circle(){}
	Circle(double radius){
		this.radius=radius;
	}
	double getArea() {
		return radius*radius*3.14;
	}
	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
}

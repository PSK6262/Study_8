package cls.cls_quiz03;

public class Triangle {
	private double width;
	private double height;
	
	Triangle(){}
	
	double getArea() {
		return width*height/2;
	}
	void setSize(double width,double height) {
		this.width = width;
		this.height= height;
	}
}

package cls.cls_quiz02;

public class MonitorMain {

	public static void main(String[] args) {
		Monitor m1 = new Monitor("삼성","더프레임",65);
		Monitor m2 = new Monitor("LG","올레드",80);
		
		m1.printInfo();
		m2.printInfo();
	}
}

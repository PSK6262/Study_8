package cls.cls02;

public class Calc {
	private String name;
	
	void powerOn() {
		System.out.println("POWER ON");
		return;
	}
	
	void setOwner(String name) {
		this.name=name;
		System.out.println("계산기 소유자 : "+ name);
		return;
	}
	
	int sum(int n1,int n2) {
		return n1+n2;
	}
	
	double sum(double n1,double n2) {
		return n1+n2;
	}
	
	String sum(String n1,String n2) {
		return n1+n2;
	}
	
	double divide(int x,int y) {
		return (double)x/y;
	}
	
	int checkBattery() {
		return 80;
	}
	
	String madeByInfo() {
		return "AAA";
	}
}

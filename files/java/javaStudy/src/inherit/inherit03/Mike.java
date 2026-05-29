package inherit.inherit03;

public class Mike {
	String type;
	String model;
	int price;
	
	public void volumeUp() {
		System.out.println("마이크 볼륨업");
	}
	public void check() {
		System.out.println("마이크 기능체크");
	}
	public final void noMethod() { // 재정의 불가능
		System.out.println("마이크 메소드(final)");
	}
}

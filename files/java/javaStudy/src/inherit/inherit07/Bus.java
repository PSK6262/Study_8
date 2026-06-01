package inherit.inherit07;

public class Bus extends Vehicle {
	public void run() {
		System.out.println("Bus 버스가 달립니다.");
	}
	//toString() 원본부터가 public으로 정의되어 있어서
	//protected나 private으로 범위를 줄일 수 없다
	public String toString() {
		return "BusBus";
	}
}

package inherit.inherit07;
//public class Driver extends Object << 사실 모든 클래스는 Object를 상속받고있다.
public class Driver {
	//운전자
	public void driveBus(Bus bus) {
		System.out.println("운전자 driveBus");
		bus.run();
	}
	public void driveTaxi(Taxi taxi) {
		System.out.println("운전자 driveTaxi");
		taxi.run();
	}
	public void drive(Vehicle vehicle) {
		System.out.println("운전자 drive");
		vehicle.run();
	}
	
	//toString 메소드 선언(생성) 인것처럼 보이지만 메소드 재정의(overriding)
	public String toString() {
		return "이것은 Driver 입니다.";
	}
}

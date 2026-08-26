package inherit.inherit07;

public class Inherit07Main {

	public static void main(String[] args) {
		
		Driver d1 = new Driver() ;
		Taxi t1 = new Taxi();
		Bus b1 = new Bus();
		
		System.out.println(d1.toString());
		System.out.println(t1.toString() );
		System.out.println(b1.toString());
		
		//d1.driveBus(b1);
		//d1.driveTaxi(t1);
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Bus();
		Vehicle v3 = new Taxi();
		d1.drive(v1);
		d1.drive(v2);
		d1.drive(v3);
		
		System.out.println("Vehicle 타입 매개변수");
		System.out.println("Vehicle + 상속받은 자식객체 전달 가능");
		
		Taxi t3 = takeTaxi();
		Bus b3 = takeBus();
		Vehicle v5 = takeTaxi();
		Vehicle v6 = takeBus();
		//Bus b_test = takeBus2(); 본체가 Bus지만 안됨(Vehicle로 명시해서) 
		Vehicle v7 = takeBus2();
		if(v7 instanceof Bus) { // v7의 내용물이 Bus가 맞느냐
			Bus b_test = (Bus)takeBus2();
		}
		
		
	}
	public static Taxi takeTaxi() {
		return new Taxi();
	}
	public static Bus  takeBus() {
		return new Bus();
	}
	public static Vehicle takeBus2() {
		return new Bus();
	}
}

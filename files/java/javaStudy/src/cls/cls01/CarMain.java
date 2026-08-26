package cls.cls01;

public class CarMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.setModel("아반떼");
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		
		Car car2 = new Car("그랜져","black",1);
		System.out.println(car2.getModel());
		System.out.println(car2.getColor());
		System.out.println(car2.getPrice());
	}
}

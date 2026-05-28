package inherit.inherit01;

public class Inherit01Main {
	public static void main(String[] args) {
		Parent p1 = new Parent(5000);
		//p1.money = 5000;
		p1.work();
		
		Child c1 = new Child();
		c1.school = "A학교";
		c1.grade = 3;
		c1.play();
		c1.work();
		c1.printInfo();
	}
}

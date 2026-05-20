package cls.cls02;

public class CalcMain {
	public static void main(String args[]) {
		Calc c = new Calc();
		
		c.powerOn();
		c.setOwner("PSK");
		System.out.println(c.sum(10,20));
		System.out.println(c.sum("a","b"));
		System.out.println(c.divide(768, 12));
		System.out.println(c.madeByInfo());
	}
}

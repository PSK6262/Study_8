package abst;

public class AbstractMain {

	public static void main(String[] args) {

		//Beverage b1 = new Beverage();
		//추상클래스는 혼자 객체생성 안된다.
		
		Hite h1 = new Hite();
		h1.name = "하이트";
		h1.ml = 330;
		h1.alcohol = 6.2;
		h1.introduce();
		h1.checkAlcohol();
		
		Coke c1 = new Coke();
		c1.name = "코카콜라";
		c1.ml = 500;
		c1.sugar = 30;
		c1.introduce();
		
		Beverage b1 = new Coke();
		Beverage b2 = new Hite();
		
		Beverage[] bArr = {c1,h1};
		
		b1.checkSafety();
		b2.checkSafety();
		
		Hite hh = (Hite)b2;
		hh.checkAlcohol();
	}
}

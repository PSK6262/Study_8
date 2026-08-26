package abst;

public class Hite extends Beverage {
	double alcohol;
	
	@Override
	public void introduce() {
		System.out.println("저는 Hite 입니다.");
	}
	
	public void checkAlcohol() {
		System.out.println("Hite 알코올 도수 확인");
	}

	public void checkSafety() {
		System.out.println("알콜 도수 문제 확인");
	}
}

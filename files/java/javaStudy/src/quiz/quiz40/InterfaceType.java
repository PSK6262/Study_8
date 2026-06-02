package quiz.quiz40;

public class InterfaceType {
	public static void main(String[] args) {
		
		Food f1 = new Food("족발",19800);
		Electronics e1 = new Electronics("에어팟",199000);
		Clothing c1 = new Clothing("셔츠",49900);
		// 객체 생성
		Orderable[] oArr = {f1,e1,c1};
		int sum = 0;
		for(Orderable o : oArr) {
			sum += o.discountedPrice();
		}
		// 총합 계산
		System.out.println("총합: "+sum+"원");
		// 결과 출력
	}
}

interface Orderable {
	public int discountedPrice();
}

class Food implements Orderable {
	private String name;
	private int price;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public int discountedPrice() {
		return (price*90)/100; // 음식 할인률 10%
	}
}
class Electronics implements Orderable {
	private String name;
	private int price;
	
	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public int discountedPrice() {
		return (price*80)/100; // 전자기기 할인률 20%
	}
}

class Clothing implements Orderable {
	private String name;
	private int price;
	
	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public int discountedPrice() {
		return (price*70)/100; // 의류 할인률 30%
	}
}
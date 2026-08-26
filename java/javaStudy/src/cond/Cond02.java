package cond;

public class Cond02 {

	public static void main(String[] args) {
		
		int fee = 0;
		int coupon = 500;
		boolean isHungry = true;
		
		if(isHungry){
			System.out.println("햄버거 주문 ");
			fee += 5000;
		} else {
			System.out.println("안 사먹음");
		}
		
		boolean option = false;
		if (option) {
			System.out.println("패티 추가 2000원");
			fee += 2000;
		} else {
			System.out.println("노 옵션");
		}
		
		boolean isDiscount = true;
		if (isDiscount) {
			System.out.println("할인쿠폰 적용");
			fee -= coupon;
		} else {
			System.out.println("할인쿠폰 미적용");
		}
		System.out.println(fee+"원 , 할인쿠폰 "+coupon+"원 적용");
	}
}

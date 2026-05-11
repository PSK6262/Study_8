package cond;

public class Cond01 {

	public static void main(String[] args) {
		
		int x = 1;
		if(x == 1) {
			System.out.println("x는 1이다");
		} else {
			System.out.println("x는 1이 아님");
		}
		
		int num = 0;
		
		if(num < 10){
			System.out.println("num < 10");
		} else {
			System.out.println("num >= 10");
		}
		
		boolean b = (5 > 10);
		
		if(b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}

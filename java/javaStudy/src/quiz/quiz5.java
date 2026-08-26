package quiz;

import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {

		int num = 10;
		System.out.println((num==0) ? "0" : (num>0) ? "양수" : "음수");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		double x,y;
		System.out.print("첫번째 숫자를 입력하세요 : ");
		x = scan.nextDouble();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		y = scan.nextDouble();
		
		System.out.println("더하기 : "+x+" + "+y+" = "+(x+y));
		System.out.println("빼기 : "+x+" - "+y+" = "+(x-y));
		System.out.println("곱하기 : "+x+" * "+y+" = "+(x*y));
		System.out.println("나누기 : "+x+" / "+y+" = "+(x/y));
	}
}
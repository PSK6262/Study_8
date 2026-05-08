package quiz;

import java.util.Scanner;

public class quiz6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double triangleWidth,triangleHeight;
		System.out.print("삼각형의 밑변 : ");
		triangleWidth = scan.nextDouble();
		System.out.print("삼각형의 높이 : ");
		triangleHeight = scan.nextDouble();
		double triangleSize = triangleWidth*triangleHeight/2;
		System.out.println("삼각형의 넓이 : "+triangleSize);
		
		double trapeUpWidth,trapeDownWidth,trapeHeight;
		System.out.print("사다리꼴의 윗변 : ");
		trapeUpWidth = scan.nextDouble();
		System.out.print("사다리꼴의 아랫변 : ");
		trapeDownWidth = scan.nextDouble();
		System.out.print("사다리꼴의 높이 : ");
		trapeHeight = scan.nextDouble();
		double trapezoidSize = (trapeUpWidth+trapeDownWidth)*trapeHeight/2;
		
		System.out.println("사다리꼴의 높이 : " + trapezoidSize);
		
		int studentNum = 24;
		int snackNum = 100;
		
		System.out.println("한명당 "+snackNum/studentNum+"개 , 남는 숫자 "+snackNum%studentNum+"개");
		
		int threeDigit = scan.nextInt();
		System.out.println("백의자리 : "+threeDigit/100);
		System.out.println("십의자리 : "+threeDigit/10%10);
		System.out.println("일의자리 : "+threeDigit%10);
		
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		int z = x;
		x = y;
		y = z;
		System.out.println("x="+x+ " y="+y);
	}
}
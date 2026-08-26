package quiz;

import java.util.Scanner;

public class quiz12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = scan.nextInt();
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println(year+"년은 윤년 입니다.");
		}
		else System.out.println(year+"년은 윤년이 아닙니다.");
 	}
}
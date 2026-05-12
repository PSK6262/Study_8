package quiz;

import java.util.Scanner;

public class quiz8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("출생년도를 입력하세요 : ");
		int birthYear = scan.nextInt();
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		int secondNum = scan.nextInt();
		
		if(birthYear >= 2000 && birthYear < 2027) {
			if(secondNum == 3) System.out.println((2026-birthYear+1)+"살 남자입니다.");
			else if(secondNum == 4) System.out.println((2026-birthYear+1)+"살 여자입니다.");
			else System.out.println("잘못된 입력입니다.");
		}
		else if (birthYear < 2000){
			if(secondNum == 1) System.out.println((2026-birthYear+1)+"살 남자입니다.");
			else if(secondNum == 2) System.out.println((2026-birthYear+1)+"살 여자입니다.");
			else System.out.println("잘못된 입력입니다.");
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}
}
package quiz;

import java.util.Scanner;

public class quiz7 {

	public static void main(String[] args) {
		//1
		Scanner scan = new Scanner(System.in);
		
		int currentTime = scan.nextInt();
		if(currentTime<1 || currentTime>24) {
			System.out.println("잘못 입력했습니다.");
		}
		else if (currentTime<=12){
			System.out.println("오전입니다.");
			if (currentTime <= 6 && currentTime > 0) {
				System.out.println("이른 오전입니다.");
			}
			else {
				System.out.println("늦은 오전입니다.");
			}
		}
		else {
			System.out.println("오후입니다.");
			if (currentTime <= 24 && currentTime > 18) {
				System.out.println("늦은 오후입니다.");
			}
			else {
				System.out.println("이른 오후입니다.");
			}
		}
			
		//2 
		int diceNum = 3;
		if(diceNum == 1) {
			System.out.println("1");
		}
		else if(diceNum == 2) {
			System.out.println("2");
		}
		else if(diceNum == 3) {
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
		}
		else if(diceNum == 4) {
			System.out.println("4");
			System.out.println("5");
		}
		else if(diceNum == 5) {
			System.out.println("5");
		}
		else {
			System.out.println("6");
		}
		//3
		String localNum = "031";
		switch(localNum) {
			case "031": {
				System.out.println("경기도입니다.");
				break; 
			}
			case "02": {
				System.out.println("서울입니다.");
				break; 
			}
			case "041": {
				System.out.println("충남입니다.");
				break; 
			}
			case "051": {
				System.out.println("부산입니다.");
				break; 
			}
		}
		//4
		int score = 80;
		switch(score/10) {
			case 10:{
				System.out.println("학점 A");
				break;
			}
			case 9:{
				System.out.println("학점 A");
				break;
			}
			case 8:{
				System.out.println("학점 B");
				break;
			}
			case 7:{
				System.out.println("학점 C");
				break;
			}
			default:{
				System.out.println("학점 D");
				break;
			}
		}
	}
}
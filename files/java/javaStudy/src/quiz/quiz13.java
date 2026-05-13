package quiz;

import java.util.Scanner;

public class quiz13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1
		System.out.print("입력 : ");
		int evenOdd = scan.nextInt();
		if(evenOdd%2==0) System.out.println("Even");
		else System.out.println("Odd");
		
		//2
		System.out.print("입력 : ");
		int seventh = scan.nextInt();
		if(seventh%7==0) System.out.println("7의 배수입니다.");
		else System.out.println("7의 배수가 아닙니다.");
		
		//3
		int fifthSum = 0;
		for(int i=1;i<=1000;i++){
			if(i%5==0) fifthSum += i;
		}
		System.out.println("1부터 1000까지 5의 배수 합 : "+fifthSum);
		
		//4
		System.out.print("입력 : ");
		int asteriskPrint = scan.nextInt();
		if(asteriskPrint <=50 && asteriskPrint > 0) {
			for(int i=0;i<asteriskPrint;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//5
		int pmSum = 0;
		for(int i=1;i<=10;i++) {
			if(i%2==1) pmSum += i;
			else pmSum -= i;
		}
		System.out.println("1-2+3-4... 10까지의 값 : "+pmSum);
		
		//6
		int n = 1;
		int pSum = 0;
		while(pSum <= 1000) {
			pSum += n++;
		}
		System.out.println("1부터 쭉 누적으로 더했을 때 1000을 넘는 처음의 값 : "+pSum);
		
		//7
		System.out.print("입력 : ");
		int mtNum = scan.nextInt();
		for(int i=1;i<=9;i++) System.out.println(mtNum+" * "+i+" = "+mtNum*i);
	}
}
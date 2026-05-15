package quiz;

import java.util.Scanner;

public class quiz17 {

	public static void main(String[] args) {
		//1
		boolean[][] isCorrect = new boolean[10][10];
			
		//찾기
		for(int i=0;2*i<isCorrect.length;i++) {
			for(int j=0;4*j<isCorrect[i].length;j++) {
				isCorrect[i][j] = false;
				if((i*2)+(j*4) == 10 && !(i == 0 || j == 0 )) {
					isCorrect[i][j] = true;
				}
			}
		}
		//출력
		for(int i=0;i<isCorrect.length;i++) {
			for(int j=0;j<isCorrect[i].length;j++) {
				if(isCorrect[i][j]) {
					System.out.println("("+i+","+j+")");
				}
			}
		}
		//2
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int a = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int b = scan.nextInt();
		if(a>b) System.out.println(a-b);
		else System.out.println(b-a); // a=b라서 0이되는경우 포함
		//Math.abs(a-b);
		
		//3
		int[] yut = new int[4];
		int sum = 0;
		System.out.print("4개의 숫자를 입력하세요. 예시) 0 0 1 0 : ");
		for(int i=0;i<yut.length;i++) {
			yut[i] = scan.nextInt();
			if(yut[i] == 1) sum++;
		}
		switch(sum) {
			case 0: System.out.println("윷");
					break;
			case 1: System.out.println("도");
					break;
			case 2: System.out.println("개");
					break;
			case 3: System.out.println("걸");
					break;
			case 4: System.out.println("모");
					break;
			default: System.out.println("잘못된 값");
					break;
		}
		//4
		int asterisk = scan.nextInt();
		for(int i=0;i<asterisk;i++) System.out.print("*");
	}
}
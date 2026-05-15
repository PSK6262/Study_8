package quiz;

import java.util.Scanner;

public class quiz18 {

	public static void main(String[] args) {
		//1
		Scanner scan = new Scanner(System.in);
		int asteriskNum = scan.nextInt();
		for(int i=0;i<asteriskNum;i++) {
			for(int j=asteriskNum-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//2
		asteriskNum = scan.nextInt();
		for(int i=0;i<asteriskNum;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//3
		int cf = scan.nextInt();
		boolean[] isCf = new boolean[(cf/2)+1];
		for(int i=1;i<=cf/2;i++) { //절반까지만
			if(cf%i==0) isCf[i] = true;
			else isCf[i] = false;
		}
		for(int i=1;i<=cf/2;i++) 
			if(isCf[i])
				System.out.print(i+" ");
		System.out.println(cf);
		//4
		int asteriskMountain = scan.nextInt();
		for(int i=0;i<asteriskMountain;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=asteriskMountain;i++) {
			for(int j=asteriskMountain-i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//5 
		int sum1 = 0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i ;j++) {
				sum1 += j;
			}
		}
		System.out.println(sum1);
		//6
		int pmCount = 1;
		int sum2 = 0;
		while(true) {
			if(pmCount%2 == 1) 
				sum2 += pmCount++;
			else
				sum2 -= pmCount++;
			if(sum2 >= 100) break;
		}
		System.out.println("처음 100이 넘은 시점의 누적합 : "+sum2 +","+(pmCount-1)+"번쨰");
	}
}
package quiz;

import java.util.Scanner;

public class quiz14 {

	public static void main(String[] args) {
		//1
		Scanner scan = new Scanner(System.in);
		int[] iArr = new int[5];
		for(int i=0;i<iArr.length;i++) iArr[i] = scan.nextInt();
		System.out.print("몇번째 수인가요? : ");
		int count=scan.nextInt();
		System.out.println("결과 : "+iArr[count-1]);
		System.out.println();
		
		//2
		for(int i=0;i<iArr.length;i++) iArr[i]= scan.nextInt();
		for(int j=iArr.length-1;j>=0;j--) System.out.print(iArr[j]+" ");
		System.out.println();
		System.out.println();
		
		//3
		int[][] square = new int[4][4];
		for(int i=0;i<square.length;i++) {
			for(int j=0;j<square[i].length;j++){
				square[i][j] = (i*4+j)+1;
				System.out.printf("%2d ",square[i][j]);
			}
			System.out.println();
		}
		
	}
}
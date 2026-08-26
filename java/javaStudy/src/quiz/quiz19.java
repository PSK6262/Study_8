package quiz;

import java.util.Scanner;

public class quiz19 {

	public static void main(String[] args) {
		
		int[][] iArr = new int[4][4];
		//1
		for(int i=0;i<iArr.length;i++) {
			for(int j=0;j<iArr[i].length;j++) {
				iArr[i][j] = (i*4) + (j+1);
				System.out.printf("%3d ",iArr[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------");
		//2
		for(int i=0;i<iArr.length;i++) {
			for(int j=0;j<iArr[i].length;j++) {
				iArr[i][j] = (j*4) + (i+1);
				System.out.printf("%3d ",iArr[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------");
		//3
		for(int i=iArr.length-1;i>=0;i--) {
			for(int j=iArr[i].length-1;j>=0;j--) {
				iArr[i][j] = (i*4) + (j+1);
				System.out.printf("%3d ",iArr[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------");
		//4
		for(int i=iArr.length-1;i>=0;i--) {
			for(int j=iArr[i].length-1;j>=0;j--) {
				iArr[i][j] = (j*4) + (i+1);
				System.out.printf("%3d ",iArr[i][j]);
			}
			System.out.println();
		}
	}
}
package quiz;

import java.util.Scanner;

public class quiz21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int studentNum = 5;
		int classNum = 3;
		int[][] classStudentScore = new int[classNum][studentNum];
		int[] sum = new int[classNum];
		int[] avg = new int[classNum];
		
		for(int i=0;i<classNum;i++) {
			System.out.print((i+1)+"반 : ");
			for(int j=0;j<studentNum;j++) {
				classStudentScore[i][j] = scan.nextInt();
				sum[i] += classStudentScore[i][j];
			}
			avg[i] = sum[i] / studentNum;
		}
		for(int i=0;i<classNum;i++)
			System.out.println((i+1)+"반 평균 : "+avg[i]);
		
		int stuAvg = 0;
		for(int i=0;i<classNum;i++) 
			stuAvg += avg[i];
		
		System.out.println("전체 평균 : "+(stuAvg)/(double)classNum);
	}
}
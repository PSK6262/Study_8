package quiz;

import java.util.Random;
import java.util.Scanner;

public class quiz22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1 
		for(int d1=1;d1<=6;d1++) {
			for(int d2=1;d2<=6;d2++) {
				if((d1+d2) == 6)
					System.out.print("("+d1+","+d2+")");
			}
			System.out.println();
		}
		//2 *******
		Random rand = new Random();
		int[] lotto = new int[6];
		for(int i=0;i<6;i++) {
			lotto[i] = (int)rand.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		for(int p : lotto) System.out.println(p);
		
		System.out.println();
		
		//2 다른방법/ new int[45]; 를 먼저 선언하고 하나씩 빼기
		int[] iArr = new int[45];
		for(int i=0;i<iArr.length;i++) iArr[i] = i+1;
		
		int[] lot = new int[6];
		for(int i=0;i<6;i++) {
			int temp = (int)rand.nextInt(45)+1;
			if(iArr[temp-1] != 0) {
				lot[i]=iArr[temp-1];
				iArr[temp-1]=0;	
			}
			else i--;
		}
		for(int p : lot) System.out.println(p);
		
		//4
		System.out.println();
		int[][] arr = {
						{10, 20, 30},
						{20, 30, 40},
						{30, 40, 50}
		};
		
		int[][] arrB = new int [arr.length+1][arr.length+1];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arrB[i][j] = arr[i][j];
				arrB[i][arr.length] += arr[i][j];
				arrB[arr.length][i] += arr[j][i];
			}
			arrB[arr.length][arr.length] += arrB[i][arr.length]; 
		}
		
		for(int i=0;i<arrB.length;i++) {
			for(int j=0;j<arrB[i].length;j++){
				System.out.print(arrB[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		//5
		
		int[] scores = {88,92,75,63,95,70,85,90,100,67};
		int maxV = scores[0];
		int minV = scores[0];
		double avg = 0;
		int eCount = 0;
		for(int i=0;i<scores.length;i++) {
			if(maxV < scores[i]) maxV = scores[i];
			if(minV > scores[i]) minV = scores[i];
			if(scores[i] >= 80) eCount++;
			avg += scores[i];
		}
		avg /= scores.length;
		
		System.out.println("최고 점수 : "+maxV);
		System.out.println("최저 점수 : "+minV);
		System.out.println("평균 점수 : "+avg);
		System.out.println("80점 이상 학생 수 : "+eCount+"명");
	}
}
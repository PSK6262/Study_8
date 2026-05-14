package refer;

import java.util.Scanner;

public class Arr01 {

	public static void main(String[] args) {
		
//		int score1 = 100;
//		int score2 = 50;
//		int score3 = 75;
//		int score4 = 80;
//		int score5 = 40;
//		
//		int sum = 0;
//		sum = score1+score2+score3+score4+score5;
//		double avg = sum/5.;
//		System.out.println("총점 : "+sum+" 평균 : "+avg);
//		
//		//int[] scoreArr = new int[5];
		int[] scoreArr = {100,50,75,80,40};		
//		for(int i=0;i<scoreArr.length;i++) {
//			System.out.println(scoreArr[i]);
//		}
		
		for(int p : scoreArr) {
			System.out.print(p+" ");
		}
		System.out.println();
		int n;
		int[] menuArr;
		
		int n2;
		int[] pointArr = null;
		// pointArr = {1,2,3}; 생성 시점이 아니면 안된다. 
		
		pointArr = new int[] {30,20,10,5,1};
		pointArr = new int[5]; // 사이즈 명시
		
		n = 30;
		n += 5;
		for(int i=0;i<5;i++) pointArr[i] = i+1;
		for(int p : pointArr) System.out.print(p+" ");
		System.out.println();
		for(int i=1;i<=5;i++) pointArr[i-1] = i;
		for(int p : pointArr) System.out.print(p+" ");
		System.out.println();
		System.out.println(pointArr);
		
		//초기값 확인
		int[] intArr = new int[6];
		double[] doubleArr = new double[12];
		String[] stringArr = new String[12];
		boolean[] booleanArr = new boolean[12];
		
		for(int i=0;i<intArr.length;i++) System.out.print(intArr[i]+" ");
		System.out.println();
		// 0
		for(int i=0;i<doubleArr.length;i++) System.out.print(doubleArr[i]+" "); 
		System.out.println();
		// 0.0
		for(int i=0;i<stringArr.length;i++) System.out.print(stringArr[i]+" "); 
		System.out.println();
		// null
		for(int i=0;i<booleanArr.length;i++) System.out.print(booleanArr[i]+" "); 
		System.out.println();
		// false
	}
}

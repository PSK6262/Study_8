package refer;

import java.util.Scanner;

public class Arr01 {

	public static void main(String[] args) {
		
		int score1 = 100;
		int score2 = 50;
		int score3 = 75;
		int score4 = 80;
		int score5 = 40;
		
		int sum = 0;
		sum = score1+score2+score3+score4+score5;
		double avg = sum/5.;
		System.out.println("총점 : "+sum+" 평균 : "+avg);
		
		//int[] score_arr = new int[5];
		int[] score_arr = {100,50,75,80,40};
		
		for(int i=0;i<score_arr.length;i++) {
			System.out.println(score_arr[i]);
		}
		
		for(int p : score_arr) {
			System.out.println(p);
		}
	}
}

package refer;

import java.util.Scanner;

public class Arr05 {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};
		
		for(int i=0;i<arr.length;i++) 
			System.out.printf("arr[%d]=%d\n",i,arr[i]);
		System.out.println();
		
		for(int p : arr)
			System.out.print(p+" ");
		System.out.println();
		System.out.println();
		int[] scores = {90,95,100,85,80};
		int sum = 0;
		for(int i=0;i<scores.length;i++)
			sum += scores[i];
		System.out.println(sum);
		sum = 0;
		for(int p : scores) {
			System.out.print(p+" ");
			sum += p;
		}
		System.out.println();
		System.out.println();
		System.out.println();
		for(int p : scores) // 지역변수일 뿐
			p -= 5;
		for(int i=0;i<scores.length;i++) // 이건 된다
			scores[i] -= 5;
		for(int p : scores)
			System.out.print(p+" ");
	} 
}

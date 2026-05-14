package refer;

import java.util.Scanner;

public class Arr02 {

	public static void main(String[] args) {

		int n = 10; // ㅁ
		int[] arr1 = new int[5]; // ㅁㅁㅁㅁㅁ
		int[][] arr2 = new int[3][5]; 
		// ㅁㅁㅁㅁㅁ
		// ㅁㅁㅁㅁㅁ
		// ㅁㅁㅁㅁㅁ
		
		int[][] arr3 = new int[4][3];
		
		int[] arr11 = {1,2,3,4,5,6};
		int[][] arr22 = {{1,2,3},{4,5,6}};
		//1,2,3
		//4,5,6
		int[][] arr33 = {{1,2},{3,4},{5,6}};
		//1,2
		//3,4
		//5,6
		
		System.out.println(arr22[0][2]);
		System.out.println(arr33[2][1]);
		
		int[][] arr4 = new int[2][3];
		// 배열의 인덱스를 가져오는거라면 enhanced for문 보다는 그냥 for문이 낫다.
		for(int i=0;i<arr4.length;i++) { // 행 길이
			for(int j=0;j<arr4[i].length;j++) { // 열 길이
				arr4[i][j] = (i+1)*(j+1);
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
	}
}

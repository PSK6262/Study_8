package refer;

import java.util.Scanner;

public class Arr04 {

	public static void main(String[] args) {
			//array reference vs int primitive
		int a = 10;
		int b = a;
		System.out.println(a + " " + b);
		b = 20;
		System.out.println(a + " " + b);
		
		int[] arr1 = {10,20,30};
		int[] arr2 = arr1; // shallow copy
		
		for(int p : arr1)
			System.out.print(p+" ");
		System.out.println();
		for(int p : arr2)
			System.out.print(p+" ");
		System.out.println();
		
		arr2[0] = 99; // arr1의 값도 변경..
		//shallow copy vs deep copy
		System.out.println("shallow copy");
		for(int p : arr1)
			System.out.print(p+" ");
		System.out.println();
		for(int p : arr2)
			System.out.print(p+" ");
		System.out.println();
		System.out.println("deep copy");
		int[] arr3 = {10,20,30};
		int[] arr4 = new int[3];
		
		for(int i=0;i<arr3.length;i++) arr4[i]=arr3[i];
		arr4[0] = 99; // arr4의 값만 변경
		for(int p : arr3)
			System.out.print(p+" ");
		System.out.println();
		for(int p : arr4)
			System.out.print(p+" ");
		System.out.println();
		System.out.println("---------");
		System.out.println(arr1 == arr2); // shallow -> true
		System.out.println(arr3 == arr4); // deep -> false
		
		System.out.println(arr1[2] == arr2[2]); // 값 비교는 둘다 true
		System.out.println(arr3[2] == arr4[2]);
		
		int[] arr5 = {10,20,30};
		int[] arr6 = new int[3];
		System.arraycopy(arr5, 0, arr6, 0, arr5.length); //(복사대상,인덱스,저장대상,인덱스,길이) shallow

		for(int p : arr5)
			System.out.print(p+" ");
		System.out.println();
		for(int p : arr6)
			System.out.print(p+" ");
		System.out.println();
	} 
}

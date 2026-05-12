package Iter;

public class Iter01 {

	public static void main(String[] args) {
//		
//		for(int i=0;i<10;i++) {
//			System.out.println("밥먹자"+i);
//		}
//		
//		for(int i=1;i<=10;i++){
//			System.out.println("다이어트 "+i+"일차");
//		}
		int sum = 0;
		for (int n=1;n<=5;n++) {
			sum = sum + n;
		}
		System.out.println(sum);
		int sum2 = 0;
		for (int n=1;n<=10;n++) {
			sum2 = sum2 + n*10;
		}
		System.out.println("10,20,30...90,100까지의 합"+sum2);
	}
}

package Iter;

public class Iter3 {

	public static void main(String[] args) {

//		for(int i=0;i<=5;i++){
//			System.out.println("for i 실행문 : " + i);
//			
//			for( int j=1;j<=3;j++) {
//				System.out.println("for j 실행문 : " + j);
//			}
//			System.out.println("-- for i 실행문 한사이클 종료 --");
//		}
		
		for(int i=1;i<=3;i++) {
			System.out.println(i+"빈 방 청소");
			for(int j=1;j<=3;j++) {
				System.out.println("쓸기");
			}
			int k=1;
			while(k<=2) {
				System.out.println("닦기");
				k++;
			}
			System.out.println("쓰레기 정리");
		} 
	}
}

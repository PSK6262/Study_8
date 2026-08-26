package Iter;

public class Iter02 {

	public static void main(String[] args) {
//		int i=1;
//		while(i<=5) {
//			System.out.println(i++);
//		}
		int n=1;
		int m=3;
		System.out.println(m);
		while(true){
			if(n==m)
			{
				m=m*3;
				System.out.println(m);
			}
			if(m>100) break;
			n++;
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(int i=1;i<=10;i++) {
			if(i%2==1) continue;
			System.out.println(i);
		}
	}
}

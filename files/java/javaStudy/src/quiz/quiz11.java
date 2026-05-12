package quiz;

public class quiz11 {

	public static void main(String[] args) {
		// 반복문 1개
		for(int i=1;i<=5;i++) System.out.println("12345");
		System.out.println();
		for(int i=1;i<=5;i++) System.out.println(i+""+i+""+i+""+i+""+i);
		System.out.println();
		// 반복문 2개
		for(int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print(j+"");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i+"");
			}
			System.out.println();
		}
 	}
}
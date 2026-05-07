package var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = 10;
		
		boolean b1 = (num1 == num2);
		System.out.println(b1);
		scanner.nextLine();
		
		String s = scanner.nextLine();
		boolean b2 = s.equals("HI"); // 값이 같느냐
		boolean b3 = (s == "HI"); // 값은 같지만 객체는 다르다. , 객체가 같은 지 묻는것 , 메모리 영역에서 다름
		System.out.println(b2);
		System.out.println(b3);
	}
}

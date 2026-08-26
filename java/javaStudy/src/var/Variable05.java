package var;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {

		System.out.println("println1");
		System.out.println("println2");
		String s1 = "text test";
		System.out.println(s1);
		
		System.out.print("print1");
		System.out.print("print2\n");
		
		System.out.println("println3");
		
		int hour = 15;
		int minute = 2;
		System.out.println("현재 시간은 "+hour+"시 "+minute+"분 입니다.");
		System.out.printf("현재 시간은 %d시 %d분 입니다.\n",hour,minute);
		
		double rate = 3.141592;
		System.out.printf("이자율은 %.2f%% 입니다.\n",rate);
		System.out.printf("이자율은 %.4f%% 입니다.\n",rate);
		System.out.printf("이자율은 %10.4f%% 입니다.\n",rate); // 10칸잡고 오른쪽정렬 , 4자리 소숫점
		System.out.printf("이자율은 %-10.4f%% 입니다.\n",rate); // 10칸잡고 왼쪽정렬 , 4자리 소숫점
		
		//키보드로 입력받기
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수형 숫자 입력 : ");
		int number1 = scanner.nextInt();
		System.out.println("입력값 : "+number1);
		
		System.out.print("실수형 숫자 입력 : ");
		double number2 = scanner.nextDouble();
		System.out.println("입력값 : "+number2);
		
		scanner.nextLine(); // \n처리
		
		System.out.print("문자열 입력 : ");
		String inputString = scanner.nextLine();
		System.out.println("입력값 : "+inputString);
		
	}
}

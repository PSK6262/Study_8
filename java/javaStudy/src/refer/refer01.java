package refer;

import java.util.Scanner;

public class refer01 {

	public static void main(String[] args) {
//		int n;
//		int num=0;
//		String s1;
//		String s2=null;
//		System.out.println(s2);
//		
//		Scanner scan = new Scanner(System.in);
//		
//		String t1= "사과";
//		String t2= "사과";
//		String t3= scan.nextLine();
//		String t4= new String("사과");
//		
//		System.out.println(t1==t2);
//		System.out.println(t1.equals(t2));
//		
//		System.out.println(t1==t3);
//		System.out.println(t1.equals(t3));
//		
//		System.out.println(t1==t4);
//		System.out.println(t1.equals(t4));
//		
//		String ne = null;
//		System.out.println(ne.equals("사과"));
		int n1 = 10;
		int n2 = n1;
		System.out.println(n1);
		System.out.println(n2);
		
		String s1="커피"; // "커피"가 있는 메모리를 가르키는 것.
		String s2=s1;  // s2=s1이기에 같은 위치를 가르킨다.
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
}

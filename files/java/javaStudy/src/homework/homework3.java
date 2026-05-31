package homework;

import java.util.Scanner;

public class homework3 {
	public static void main(String[] args) {
		Person[] p = createPerson();
		for(int i=0;i<p.length;i++) p[i] = new Person();
		setPersonAge_10(p);
		System.out.println(personAgeSum(p));
	}
	public static Person[] createPerson() { //21
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		return new Person[n];
	}
	public static int personAgeSum(Person[] p) { // 22
		int sum = 0;
		for(int i=0;i<p.length;i++) {
			sum = sum + p[i].age;
		}
		return sum;
	}
	public static void setPersonAge_10(Person[] p) { // 23
		for(int i=0;i<p.length;i++)
			p[i].age = 10;
	}
	public static String[] getPersonNameArray(Person[] p) { //24
		String[] s = {};
		for(int i=0;i<p.length;i++) s[i] = p[i].name;
		return s;
	}
}

/*
25. Person을 생성해서 배열 인덱스 0에 넣는 방법을 코드로 작성하라.
26. Person 배열 일부 요소는 null일 때, null 검사를 하며 출력하는 코드를 작성하라.
27. 이름으로 Person을 검색하여 해당 객체를 리턴하는 메서드를 작성하라.
28. Person 배열을 생성하되, 짝수 인덱스에만 객체를 넣고 나머지는 null로 두어라.
29. Person을 전달받아 새로운 Person을 만들어 반환하되, name만 복사해라.
30. Person 배열을 전달받아, age가 30 이상인 사람만 새로운 배열로 리턴하라.*/
package homework;

public class homework2 {//11~20

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age=20;
		p1.name="김자바"; // 11
		
		p1.hello(); // 12
		
		personPrint(p1);//13
		
		Person p2 = newPerson();//14
		
		olderPerson(p1,p2); //15
		
		System.out.println(p1.age);//16
		agePlusOne(p1);
		System.out.println(p1.age);
		System.out.println();
		
		Person p3 = new Person("김자바스크립트",23);//17
		int tempAge = p3.age;
		String tempName = p3.name;
		tempAge += 20;
		tempName += "는자바랑관련없음";
		System.out.println(tempAge +" "+ p3.age);
		System.out.println(tempName+" "+ p3.name); //원본은 변하지않는다
		System.out.println();
		
		Person[] pArr = new Person[3]; //18
		for(int i=0;i<pArr.length;i++) pArr[i] = new Person();
		pArr[0].name = "김루비"; pArr[0].age=30;
		pArr[1].name = "김포트란"; pArr[1].age=40;
		pArr[2].name = "김씨"; pArr[2].age=50;
		for(int i=0;i<pArr.length;i++) 
			System.out.print(pArr[i].name+" "); //18
		
		System.out.println();
		
		for(int i=0;i<pArr.length;i++)
			pArr[i].hello();//19
		System.out.println();
		System.out.println(olderPerson(pArr)); // 20
		
	}
	public static void personPrint(Person p) {//13
		System.out.println(p.name);
	}
	public static Person newPerson() {//14
		return new Person("김파이썬",21);
	}
	public static void olderPerson(Person p1,Person p2) {//15
		if(p1.age>p2.age) System.out.println(p1.name+"님의 나이가 더 많습니다.");
		else if(p1.age<p2.age) System.out.println(p2.name+"님의 나이가 더 많습니다.");
		else System.out.println(p1.name+"님과 "+p2.name+"님의 나이가 같습니다.");
	}
	public static void agePlusOne(Person p) {//16
		p.age++;
	}
	public static String olderPerson(Person[] pArr) { // 20
		int maxAge = pArr[0].age;
		int index = 0;
		for(int i=1;i<pArr.length;i++) {
			if(maxAge < pArr[i].age) {
				maxAge = pArr[i].age;
				index = i;
			}
		}
		return pArr[index].name;
	}
}

/* 남은거 내일.
🔹 3단계: 객체배열 + 생성 메서드 + 다양한 조합 (21~30)
21. 길이를 입력받아 Person 배열을 생성해 리턴하는 메서드를 작성하라.
22. Person 배열에 대해 모든 사람의 나이를 합산하는 메서드를 작성하라.
23. Person 배열을 전달하면, 모든 나이를 10으로 초기화하는 메서드를 만들어라.
24. Person 배열의 name만 따로 String[] 에 담아 리턴하는 메서드를 작성하라.
25. Person을 생성해서 배열 인덱스 0에 넣는 방법을 코드로 작성하라.
26. Person 배열 일부 요소는 null일 때, null 검사를 하며 출력하는 코드를 작성하라.
27. 이름으로 Person을 검색하여 해당 객체를 리턴하는 메서드를 작성하라.
28. Person 배열을 생성하되, 짝수 인덱스에만 객체를 넣고 나머지는 null로 두어라.
29. Person을 전달받아 새로운 Person을 만들어 반환하되, name만 복사해라.
30. Person 배열을 전달받아, age가 30 이상인 사람만 새로운 배열로 리턴하라.

🔹 4단계: 원시타입 배열 + 객체 배열 + 메서드 섞기 (31~40)
31. int 배열과 Person 배열을 모두 출력하는 메서드를 각각 만들어라.
32. Person 배열과 int 배열을 동시에 매개변수로 받아 조합해 출력하는 메서드를 작성하라.
33. Person 배열의 age 값을 int 배열로 변환하는 메서드를 작성하라.
34. int 배열을 전달받아 Person 배열로 변환하라(각 age만 채우기).
35. Person 객체를 복사(clone 비슷하게)해 새로운 Person을 리턴하는 메서드를 작성하라.
36. Person 배열을 전달받아 깊은 복사(deep copy)를 수행해 새 배열을 리턴하라.
37. Person 배열을 전달받아 이름이 null인 사람만 출력하라.
38. Person 배열과 배열 길이를 전달받아 새 배열을 만들고 기존 내용을 복사해라.
39. Person 객체를 전달받아 내부 값을 전부 초기화하는 메서드를 작성하라.
40. int 값 하나와 Person 하나를 전달받아 두 값을 비교 출력하는 메서드를 만들라.

🔹 5단계: 복잡한 객체 리턴/전달 패턴 연습 (41~45)
41. Person 객체를 여러 개 생성해 배열에 담아 리턴하는 메서드 만들기.
42. Person 배열을 전달해 모든 사람의 hello()를 호출하는 메서드 작성하기.
43. Person과 Person 배열을 동시에 매개변수로 받아 특정 위치에 저장하는 메서드 작성하기.
44. Person 배열을 전달받아 age 기준으로 정렬한 뒤 새 배열로 리턴하기.
45. Person을 전달받아 내부 필드를 수정한 뒤, 수정 결과를 main에서 확인하는 실험을 해보라.
*/

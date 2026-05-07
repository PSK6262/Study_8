package be_study.var;

public class Variable01 {

	public static void main(String[] args) {
		
		// 변수 선언
		
		// 타입 변수명
		// int 타입 : 정수형 숫자 타입 (1,2,3...)
		
		int abc; // 변수 선언
		int def; // 정수형 숫자 타입의 변수 선언
		
		int point; //선언
		int score; 

//		int x;
//		int y;
//		int z;
		
		int x, y, z;   // int(정수형)타입의 변수 x y z 3개 동시에 선언
		
		score = 90; // score 라는 이름의 변수에 90이란 값을 저장
		
		int math = 99; // math 변수 선언과 동시에 + 값 저장 -> 초기화
		
		//level = 50;  //선언하지 않은 변수명은 사용 불가
		int level; //선언한 변수
		level = 50; //변수 선언 이후 라인에서 사용
		
		int time; //선언
		time = 12; //12 값 저장
		time = 13; //13 값 저장
		
		
		int myTime = 10 + 5 - 2; //연산 가능 
		
		myTime = time + 5; 
		//     = 13   + 5
		
		time = 15;
		myTime = time + 4 + time - 2 + time;
		//       15   + 4 + 15   - 2 + 15
		
		
		
//		int value;		//변수 선언만! 값이 아직 없음
//		int result = value + 5;  // 초기안된 value 는 값X + 5 연산 불가
	
		int value = 20;  //선언 + 초기화
		int result = value + 5;  // value값이 있는 변수 연산 가능
		
		int temp; //선언만
		
		// 출력
		System.out.println(1293858);
		System.out.println("문자출력");
		System.out.println(value);
		System.out.println(result);
		//System.out.println(temp);  //초기화되지 않은 변수 출력 X
		
		System.out.println( result + 50 );
		
		System.out.println( result + value + result + value );
		//					25		 20 	 25		  20
		
		int totalScore = score + score + 50;   // 90 + 90 + 50
		System.out.println(totalScore); //230
		
		System.out.println( totalScore + 30 ); //260
		
		System.out.println(totalScore); //230
		
		totalScore = totalScore + 70;
		//           230 + 70
		
		System.out.println(totalScore); //300
		
		
		//***
		int a = 10; 
		int b = 20;
		
		System.out.println(a); // 10
		System.out.println(b); // 20
		
		// 값 바꾸기
		// a : 10   b : 20
		// a : 20   b : 10

		//			a:10	b:20
		//a = b; // a:20	b:20
		//b = a; //	a:20	b:20

		
		// 임시 저장용 추가 변수 필요
		int c = a; // a:10	b:20	c:10
		a = b;     // a:20  b:20	c:10
		b = c;     // a:20  b:10    c:10
		
		
		// a:20 	b:10
		System.out.println(a); // 20
		System.out.println(b); // 10
	}

}

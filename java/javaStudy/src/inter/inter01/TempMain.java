package inter.inter01;

public class TempMain {

	public static void main(String[] args) {
		//TempInterface t1 = new TempInterface(); 불가능
		TempObject t1 = new TempObject();
		t1.method1();
		
		System.out.println(t1.SUCCESS);
		System.out.println(t1.FAIL);

		System.out.println(TempInterface.SUCCESS);
		System.out.println(TempInterface.FAIL);
		
		TempInterface t2 = new TempObject();
		t2.method1();
		TempInterface[] tArr = { new TempObject(), new TempObject()};
		TempObject t3 =(TempObject)t2;
		t3.method1();
		t3.method99();
		
		TempInterface t10 = new TempObject();
		TempInterface2 t11 = new TempObject();
		t10.method1();
		t11.method2();
		t11.method3();
		
		/* 클래스 상속
		 *		- 부모 클래스 객체 생성 가능
		 * 		- 필드변수 선언 가능
		 * 		- 메소드 구현
		 * 		- 부모타입변수에 자식객체 대입가능
		 * 		- 상속 선언 1개만 가능
		 * 		- A is a B
		 * 
		 * 	추상 클래스 상속
		 * 		- 부모 클래스 객체 생성 불가능
		 * 		- 필드변수 선언 가능
		 * 		- 메소드 구현 + 추상 메소드 선언
		 * 		- 추상부모타입변수 = 자식객체
		 * 		- 상속 선언 1개만 가능
		 * 		- A is a B
		 * 
		 * 	인터페이스 구현
		 * 		- 인터페이스 객체 생성 불가능
		 * 		- 필드변수 선언 불가능 -> 변수는 전부 상수화(static , final)
		 * 		- 추상 메소드 선언 (abstract)
		 * 		- 인터페이스 타입 변수 = 구현객체 대입 가능
		 * 		- 인터페이스 구현 여러개(n개 가능, 상속이랑 차이점)
		 * 		- 인터페이스는 인터페이스 다중 상속 가능		
		 *		- A has a B
		 *
		 *		공통
		 *		- 다형성 : 동일한 사용법 , 다른 수행 결과
		 *		- 매개변수, 리턴타입 다형성
		 */
	}
}

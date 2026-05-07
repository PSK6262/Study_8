package var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2진수, 8진수, 10진수, 16진수
		
		int num2 = 0b10; //2진수표기 10 -> 실제 값 2 
		int num8 = 012;  //8진수표기 12 -> 실제 값 10
		int num10 = 10;  // 10  10진수표기
		int num16 = 0x30; //16진수표기 30 -> 실제 값 48
		
		char chr1 = 'A'; // char 타입 (정수타입) : 문자 1개 저장
						 // 'A' 작은따옴표로 감싼 문자 1개
		// chr1 = 'ABC';    // 불가능 
		
		char chr2 = 86;
		char chr3 = 0x23; 
		
		char chr4 = 'F';
		
		System.out.println(chr1);
		System.out.println(chr2);
		System.out.println(chr3);
		System.out.println(chr4);
		
		char chr5 = '안';
		// char chr6 = '안녕';  //char 문자 1개만 가능
		
		//문자열 타입 " " 큰따옴표로 감싼 문자 여러개
		String s1 = "안";
		String s2 = "녕";
		String s3 = "안녕하세요~";
		String s4 = "1234";
		
		System.out.println(s3);
		System.out.println(s4);
		
		int n = 1234; //정수형
		
		System.out.println( n + 10 );
		//			   1234 + 10 = 1244
		System.out.println( s4 + 10 );
		// 			   "1234" + 10 = "123410"
		
		// 문자열 + 숫자 -> 문자열
		System.out.println("지금은 16시 입니다.");
		System.out.println("지금은 " + 16 + "시 입니다.");
		
		String msg = "\"안녕\"하세요";  //    안녕하세요   
		//  "안녕"하세요  \"  문자" 인식
		System.out.println(msg);
		
		System.out.println("어서\t오세요~ \n반갑습니다.");
		
		//실수 타입 double 
		double d1 = 12.123;
		double d2 = 500.0;   //500
		double d3 = 5e2; // 500   5  *  (10^2)e2      // e5   10^5
		double d4 = 0.0012; 
		double d5 = 0.12E-2;  // 0.12 * 1/10^2  -> 0.0012
		//          0.0012
		
		float f1 = 123.45f; //float 타입은 값 뒤에 f 표기
		
		//논리형 true false  
		//       참   거짓
		boolean open = true;
		boolean close = false;
		boolean stop = false;
		
		// is...  has...
		boolean isOpened = true;
		boolean isClosed = false;
		
		boolean hasOption = true;
		
	}

}

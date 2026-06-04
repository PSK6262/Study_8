package quiz.quiz42;
//나중에 enum 바꾸기
public class ErrorCode {
		public static final int NO_ERROR = 0; // 문제 없음
		public static final int GENERAL_ERROR = -1; // 일반적 오류. 재입력
		public static final int QUANTITY_ERROR = -2; // 재고 부족 오류
		public static final int PRICE_ERROR = -3; // 가격 입력 오류
		public static final int NUMBER_ERROR = -4; // 번호 입력 오류
		public static final int QUANTITY_INPUT_ERROR = -5; // 개수 부족 오류
		
		public static void errMessage(int errNum) {
			if(errNum == ErrorCode.GENERAL_ERROR)
				System.out.println("잘못된 입력입니다. 재입력 해주세요. errorcode : -1");
			else if(errNum == ErrorCode.QUANTITY_ERROR)
				System.out.println("재고 오류, 재입력 해주세요 errorcode : -2");
			else if(errNum == ErrorCode.PRICE_ERROR)
				System.out.println("가격 오류. 재입력 해주세요 errorcode : -3");
			else if(errNum == ErrorCode.NUMBER_ERROR)
				System.out.println("번호 오류. 재입력 해주세요. errorcode : -4");
			else if(errNum == ErrorCode.QUANTITY_INPUT_ERROR)
				System.out.println("개수 오류. 재입력 해주세요. errorcode : -5");
		}
}

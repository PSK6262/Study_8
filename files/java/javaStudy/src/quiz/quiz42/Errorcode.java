package quiz.quiz42;

public interface Errorcode {
		int GENERAL_ERROR = -1; // 일반적 오류. 재입력
		int QUANTITY_ERROR = -2; // 재고 부족 오류
		int PRICE_ERROR = -3; // 가격 입력 오류
		int NUMBER_ERROR = -4; // 번호 입력 오류
		int QUANTITY_INPUT_ERROR = -5; // 개수 부족 오류
}

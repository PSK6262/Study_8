package quiz.quiz42;

public enum ErrorCode {
		NO_ERROR (0,"문제 없음"),
		GENERAL_ERROR (-1,"오류 발생. 재입력 해 주세요"),
		QUANTITY_ERROR(-2,"재고 부족. 재입력 해 주세요"),
		PRICE_ERROR(-3,"가격 입력 오류. 재입력 해 주세요"),
		NUMBER_ERROR(-4,"번호 입력 오류. 재입력 해 주세요"),
		QUANTITY_INPUT_ERROR (-5,"개수 오류. 재입력 해 주세요");
	
		private final int code;
		private final String errorMessage;
		ErrorCode(int code, String errorMessage) {
			this.code=code;
			this.errorMessage=errorMessage;
		}
		public String getErrorMessage() {
			return errorMessage;
		}
		public int getCode() {
			return code;
		}
	    public void printMessage() {
	        System.out.println(errorMessage + " [errorcode : " + code+"]");
	    }
}

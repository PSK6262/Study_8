package com.app.common;

public interface ApiCommonCode {

	public final String API_RESULT_SUCCESS = "10";
	public final String API_RESULT_INNER_ERROR = "20";
	public final String API_RESULT_FAIL_AUTH = "30";
	public final String API_RESULT_EMPTY_DATA = "40";
	
	public final String API_RESULT_SUCCESS_MSG = "정상";
	public final String API_RESULT_INNER_ERROR_MSG = "서버 내부 오류";
	public final String API_RESULT_FAIL_AUTH_MSG = "인증 오류";
	public final String API_RESULT_EMPTY_DATA_MSG = "요청 파라미터 오류";
	// 10 정상
	// 20 내부 오류
	// 30 인증 오류
	// 40 요청 파라미터 오류
}

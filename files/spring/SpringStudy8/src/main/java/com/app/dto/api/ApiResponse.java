package com.app.dto.api;

import lombok.Data;

@Data
public class ApiResponse<T> {
	// Generic
	ApiResponseHeader header;
	T body;
	
}

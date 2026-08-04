package com.app.dto.study.request;

import lombok.Data;

@Data
public class Product {
	private String id;
	private String name;
	private int price;
}

//@Getter
//@Setter
//@Tostring
// 합쳐서 @Data
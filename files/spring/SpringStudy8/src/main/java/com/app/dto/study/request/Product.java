package com.app.dto.study.request;

import lombok.Data;

@Data
public class Product {
	public Product(String id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product() {}
	private String id;
	private String name;
	private int price;
	
	
}

//@Getter
//@Setter
//@Tostring
// 합쳐서 @Data
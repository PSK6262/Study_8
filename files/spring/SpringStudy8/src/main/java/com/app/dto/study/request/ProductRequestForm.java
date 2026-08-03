package com.app.dto.study.request;

public class ProductRequestForm {
	private String id;
	private String name;
	private int price;
	private String type;
	
	public ProductRequestForm(){}
	public ProductRequestForm(String id, String name, int price, String type) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "ProductRequestForm [id=" + id + ", name=" + name + ", price=" + price + ", type=" + type + "]";
	}

}

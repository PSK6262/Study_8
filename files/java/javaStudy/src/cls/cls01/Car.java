package cls.cls01;

public class Car {
	//필드
	private String model;
	private String color;
	private int price;
	//생성자
	Car(){
		System.out.println("생성자 실행");
		color = "white";
		model=null;
		price = 0;
	}
	Car(String model,String color,int price){
		this.model=model;
		this.color=color;
		this.price=price;
	}
	// getter setter (물론 이것도 일종의 메소드)
	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}
}

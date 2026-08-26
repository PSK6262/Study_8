package cls.cls01;

public class Phone {
	private String model;
	private int price;
	private int batterySize;
	
	Phone(String model){
		this(model,1000000,3500);
	}
	Phone(String model,int price){
		this(model,price,2800);
	}
	Phone(String model,int price,int batterySize){
		this.model = model;
		this.price = price;
		this.batterySize = batterySize;
	}
	Phone(){
		this("S26",1000000,3000);
	}

	int getBatterySize() {
		return batterySize;
	}

	void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}
	
}

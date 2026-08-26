package quiz.quiz34;

public class GasStove {
	private int stoveNum;
	private int price;
	private int temperature; // 불세기조절
	private String brand;
	
	public void stoveOn() {
		System.out.println("가스레인지 ON");
	}
	public void stoveOff() {
		System.out.println("가스레인지 OFF");
	}
	public void adjustTemperature(int heat) { // 조절
		this.setTemperature(heat);
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStoveNum() {
		return stoveNum;
	}
	public void setStoveNum(int stoveNum) {
		this.stoveNum = stoveNum;
	}
}

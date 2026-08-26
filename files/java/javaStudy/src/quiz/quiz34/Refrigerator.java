package quiz.quiz34;

public class Refrigerator {
	private String brand;
	private int liter;
	private int doorCount;
	private int temperature;
	private IceTray icetray;
	
	public void adjustTemperature(int temperature) { //온도조절
		this.setTemperature(temperature);
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getDoorCount() {
		return doorCount;
	}
	public void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}
	public int getLiter() {
		return liter;
	}
	public void setLiter(int liter) {
		this.liter = liter;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public IceTray getIcetray() {
		return icetray;
	}
	public void setIcetray(IceTray icetray) {
		this.icetray = icetray;
	}
}

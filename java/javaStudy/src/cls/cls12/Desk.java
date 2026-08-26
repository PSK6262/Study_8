package cls.cls12;

public class Desk {
	private int sizeX;
	private int sizeY;
	private String color;
	
	public Desk() {}
	public Desk(int sizeX,int sizeY,String color) {
		this.setSizeX(sizeX);
		this.setSizeY(sizeY);
		this.setColor(color);
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	int getSizeY() {
		return sizeY;
	}
	void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
	int getSizeX() {
		return sizeX;
	}
	void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
}

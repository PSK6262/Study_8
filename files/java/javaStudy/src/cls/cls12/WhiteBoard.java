package cls.cls12;

public class WhiteBoard {
	private int sizeX;
	private int sizeY;
	private int price;
	private String material;
	private boolean isMagnetic;
	
	boolean isMagnetic() {
		return isMagnetic;
	}
	void setMagnetic(boolean isMagnetic) {
		this.isMagnetic = isMagnetic;
	}
	String getMaterial() {
		return material;
	}
	void setMaterial(String material) {
		this.material = material;
	}
	int getPrice() {
		return price;
	}
	void setPrice(int price) {
		this.price = price;
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

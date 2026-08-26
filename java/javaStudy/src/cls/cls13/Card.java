package cls.cls13;

public class Card {
	private int id; // 고유id
	private String type; //카드종류
	private String owner; //소유주
	private String brand; //어디브랜드
	public Card(int id, String type, String owner, String brand) {
		this.id = id;
		this.type = type;
		this.owner = owner;
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}

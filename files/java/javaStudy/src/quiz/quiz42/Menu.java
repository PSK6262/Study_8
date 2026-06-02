package quiz.quiz42;

public class Menu {
	private String name;
	private int price;
	private int quantitiy;
	
	Menu(String name,int price,int quantity){
		this.name=name;
		this.price=price;
		this.quantitiy=quantity;
	}
	public int getQuantitiy() {
		return quantitiy;
	}
	public void setQuantitiy(int quantitiy) {
		this.quantitiy = quantitiy;
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
}
 
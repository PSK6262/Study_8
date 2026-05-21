package cls.cls_quiz03;

public class Monitor { // 1
	private String brand; //2
	private int inches;
	private int prices;
	private String color;
	private int maxWidth;
	private int maxHeight;
	
	Monitor(String brand,int inches,int prices){//3
		this.brand=brand;
		this.inches=inches;
		this.prices=prices;
	}
	
	void setXY(int maxWidth,int maxHeight){//4
		this.maxWidth = maxWidth;
		this.maxHeight = maxHeight;
	}
	void setColor(String color) {
		this.color=color;
	}
	void Booting() {//5
		System.out.println("전원이 켜졌습니다.");
	}
	int increasePrice(int prices) {//6
		return this.prices += prices;
	}
	void showInfo() {//9
		System.out.println(brand+" "+inches+"인치 " + prices +"원 "+color);
		System.out.println("해상도 "+maxWidth+" * "+maxHeight);
		System.out.println();
	}
}

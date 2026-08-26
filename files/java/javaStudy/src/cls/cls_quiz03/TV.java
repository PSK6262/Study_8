package cls.cls_quiz03;

public class TV {
	String brand;
	int releaseYear;
	int inches;
	
	TV(String brand,int releaseYear,int inches){
		this.brand=brand;
		this.releaseYear=releaseYear;
		this.inches=inches;
	}
	void show() {
		System.out.println(brand+"제품 "+releaseYear+"년형 "+inches+"인치 TV");
	}
}

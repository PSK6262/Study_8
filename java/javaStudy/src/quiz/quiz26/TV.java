package quiz.quiz26;

public class TV {

	String company;  //제조사
	int year;     //몇년형
	int inch;  //몇인치
	
	TV( String company, int year, int inch ){
		this.company = company;
		this.year = year;
		this.inch = inch; 
	}
	
	void show() {
		//LG제품 2021년형 43인치 TV
		System.out.printf("%s제품 %d년형 %d인치 TV\n", company, year, inch);
	}
}

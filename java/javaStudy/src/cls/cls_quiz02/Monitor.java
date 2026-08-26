package cls.cls_quiz02;

public class Monitor {
	private String maker;
	private String model;
	private int inches;
	
	Monitor(){}
	Monitor(String maker,String model,int inches){
		this.setMaker(maker);
		this.setModel(model);
		this.setInchs(inches);
	}
	void printInfo() {
		System.out.print("제조사 : "+maker+" , ");
		System.out.print("모델명 : "+model+" , ");
		System.out.print("인치 : "+inches+"인치");
		System.out.println();
	}
	
	int getInchs() {
		return inches;
	}
	void setInchs(int inchs) {
		this.inches = inchs;
	}
	String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}
	String getMaker() {
		return maker;
	}
	void setMaker(String maker) {
		this.maker = maker;
	}
}

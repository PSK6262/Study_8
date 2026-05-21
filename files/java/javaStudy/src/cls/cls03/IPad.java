package cls.cls03;

public class IPad {
	String owner;
	
	IPad(){}
	IPad(String owner){
		this.owner=owner;
	}
	int batteryNum() {
		return 80;
	}
	void showInfo() {
		System.out.println("배터리 잔여량 : "+batteryNum());
	}
}

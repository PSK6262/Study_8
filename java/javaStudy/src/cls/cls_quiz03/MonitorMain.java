package cls.cls_quiz03;

public class MonitorMain { // 2번

	public static void main(String[] args) {
		Monitor m1 = new Monitor("삼성",27,150000); // 7
		m1.setColor("검은색"); 
		
		Monitor m2 = new Monitor("LG",32,330000);
	
		// 8
		m1.setXY(1080, 780);
		m2.setColor("흰색");
		m2.setXY(4096, 2048);
		
		m1.showInfo(); //10
		m2.showInfo();
		
		m2.increasePrice(70000); //11
		
		m1.showInfo(); //12
		m2.showInfo();
	}

}

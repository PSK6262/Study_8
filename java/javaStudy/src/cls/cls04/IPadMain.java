package cls.cls04;

public class IPadMain {

	public static void main(String[] args) {

		IPad ip1 = new IPad();
		ip1.owner = "나주인";
		ip1.showInfo();
		
		IPad ip2 = new IPad();
		ip2.owner = "김사장";
		ip2.showInfo();
		
		IPad ip3 = new IPad("최대리");
		System.out.println(ip3.owner);
		System.out.println( ip3.batteryNum() );
		
		
		IPad ip4 = new IPad();
		ip4.showInfo(); // owner = null;
		ip4.owner = "이회장";  //owner 필드변수에 값이 저장됨
		ip4.showInfo();  //owner 필드변수 값 인식 
		
		
		ip4.returnCheck();
	}

}

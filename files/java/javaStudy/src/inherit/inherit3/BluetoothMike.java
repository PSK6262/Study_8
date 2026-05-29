package inherit.inherit3;

public class BluetoothMike extends Mike {
	boolean isConnected;
	int battery;
	
	public void connect() {
		
	}
	//private로는 안됨. 범위를 줄이는것 < 불가능 . 기존 public이었기 때문에
	public void volumeUp() {
		System.out.println("블루투스 마이크 볼륨업 재정의");
	}
	
	public void volumeUp(int v) {
		System.out.println(v +" 만큼 볼륨 증가, 오버로딩");
	}
}

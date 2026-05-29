package inherit.inherit3;

public class MikeMain {

	public static void main(String[] args) {
		Mike m1 = new Mike();
		m1.type="마이크";
		m1.volumeUp();
		m1.check();
		System.out.println();
		WirelessMike m2 = new WirelessMike();
		m2.type="무선마이크";
		m2.check();
		m2.volumeUp();
		System.out.println();
		BluetoothMike m3 = new BluetoothMike();
		m3.type="블루투스마이크";
		m3.check();
		m3.volumeUp();
		m3.volumeUp(1);
		
		//final로 class정의시 상속은 되지만 재정의 불가능
	}

}

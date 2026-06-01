package inter.inter03;

public class InterfaceMain {
		public static void main(String[] args) {
			
			IPhone p1 = new IPhone();
			GalaxyPhone p2 = new GalaxyPhone();
			LGPhone p3 = new LGPhone();
			
			Callable c1 = new IPhone();
			Callable c2 = new GalaxyPhone();
			Callable c3 = new LGPhone();
			
			Person p = new Person();
			p.callPhone = p1;
			p.call();
			
			BluetoothSpeaker bs = new BluetoothSpeaker();
			
			Connectable cc = bs;
			cc = p2;
			
			Connectable cc1 = new BluetoothSpeaker();
			Connectable cc2 = new GalaxyPhone();
		}
}

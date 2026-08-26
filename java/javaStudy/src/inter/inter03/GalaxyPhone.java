package inter.inter03;

public class GalaxyPhone implements Callable,Connectable {
		int callStatus;
		@Override
		public void call() {
			System.out.println("GalaxyPhone call()");
			callStatus = Callable.CALL_ON;
		}
		@Override
		public void connect() {
			System.out.println("GalaxyPhone connect()");
		}
}

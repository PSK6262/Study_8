package inter.inter03;

public class IPhone implements Callable, Connectable {
	
		@Override
		public void call() {
			System.out.println("IPhone call()");
		}
		@Override
		public void connect() {
			System.out.println("IPhone connect()");
		}
}

package inter.inter03;

public class LGPhone implements Callable, Connectable {

		@Override
		public void call() {
			System.out.println("LGPhone call()");
		}

		@Override
		public void connect() {
			System.out.println("LGPhone connect()");
		}
}

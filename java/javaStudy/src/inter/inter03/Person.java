package inter.inter03;

public class Person {
		Callable callPhone;
		//Callable callPhone = new GalaxyPhone();
		//3가지 다 가능함.
		public void call() {
			callPhone.call(); // 귀찮게 여러개 쓸 필요 없음
		}
}

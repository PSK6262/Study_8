package cls.cls11;

public class ReturnMain {
	public static void main(String[] args) {
		AllScore a = getScore();
		System.out.println(a.lang);
		System.out.println(a.math);
		System.out.println(a.eng);
	}
	public static AllScore getScore() {
		AllScore a = new AllScore();
		a.lang=70;
		a.math=80;
		a.eng=90;
		return a; // 국 수 영 한번에 보낼 수 있다.
	}
}

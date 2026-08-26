package quiz.quiz43;
public class quiz43 {
	public static void main(String[] args)  {
		test1();
		test2();
		test3();
		test4();
		test5();
		System.out.println("main end");
	}

	public static void test1() {
		try {
			System.out.println("test1 start");
			Test t = new Test();
			System.out.println(t.toString());
			System.out.println("test1 try end");
		} catch (Exception e) {
			System.out.println("test1 catch");
		} finally {
			System.out.println("test1 finally");
		}
	}

	public static void test2() {
		try {
			System.out.println("test2 start");
			Test t = null;
			System.out.println(t.toString());
			System.out.println("test2 try end");
		} catch (Exception e) {
			System.out.println("test2 catch");
		} finally {
			System.out.println("test2 finally");
		}
	}

	public static void test3() {
		try {
			System.out.println("test3 start");
			Test t = null;
			System.out.println(t.toString());
			System.out.println("test3 try end");
		} catch (Exception e) {
			System.out.println("test3 catch");
		}
		System.out.println("test3 end");
	}

	public static void test4() {
		try {
			System.out.println("test4 start");
			Test t = null;
			System.out.println(t.toString());
			System.out.println("test4 try end");
		} catch (NullPointerException e) {
			System.out.println("test4 catch null");
		} catch (Exception e) {
			System.out.println("test4 catch");
		}
		System.out.println("test4 end");

	}

	public static void test5() {
		System.out.println("test5 start");
		Test t = null;
		System.out.println(t.toString());
		System.out.println("test5 end");
	}
}

class Test {
	public String toString() {
		return "Test";
	}
}

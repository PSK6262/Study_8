package quiz.quiz44;

import quiz.quiz44.Test;

public class quiz44 {
	public static void main(String[] args) {
		try {
			test1();
		} catch (Exception e) {
			System.out.println("main catch: Exception");
		}
		System.out.println("main end");
	}

	public static void test1() throws Exception {
		System.out.println("test1 start");
		test2();
		System.out.println("test1 end");
	}

	public static void test2() throws Exception {
		System.out.println("test2 start");
		try {
			test3();
		} catch (NullPointerException e) {
			System.out.println("test2 catch: null");
			throw e;
		} finally {
			System.out.println("test2 finally");
		}
		System.out.println("test2 end");
	}

	public static void test3() throws Exception {
		System.out.println("test3 start");
		test4();
		System.out.println("test3 end");
	}

	public static void test4() throws NullPointerException {
		System.out.println("test4 start");
		Test t = null;
		System.out.println(t.toString()); // NullPointerException 발생
		System.out.println("test4 end");
	}
}

class Test {
	public String toString() {
		return "Test";
	}
}

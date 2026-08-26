package cls.cls09;

public class Cls09Main {
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;
		
		int[] nArr = {10,20,30};
		int[] nArr1 = {n1,n2,n3};
		int[] nArr2 = new int[3];
		
		for(int i=0;i<nArr.length;i++) {
			System.out.print(nArr[i]+" ");
		}
		System.out.println();
		for(int n : nArr) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println(methodA(n3));
		methodB(nArr);
		int[] resultC = methodC();

		methodB(resultC);
		
		System.out.println("----------------");
		
		Temp09 t1 = new Temp09();
		Temp09 t2 = new Temp09();
		Temp09 t3 = new Temp09();
		
		Temp09[] tArr = {t1,t2,t3};
		Temp09[] tArr1 = null;
		tArr1 = new Temp09[3];
		tArr1[0] = new Temp09(); // 객체생성
		for(Temp09 t : tArr) {
			System.out.print(t.num + " ");
			t.method();
		}		
		System.out.println();
		for(int i=0;i<tArr.length;i++)
			methodD(tArr[i]);
		System.out.println();
		methodE(tArr);
		methodD(methodF());
		methodE(methodG());
	}
	public static int methodA(int n) {
		return n+10;
	}
	public static void methodB(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static int[] methodC() {
		int[] temp = {5,4,3,2,1};
		return temp;
	}
	public static void methodD(Temp09 t) {
		System.out.print(t.num + " ");
		t.method();
	}
	public static void methodE(Temp09[] arr) {
		for (Temp09 t : arr) {
			System.out.print(t.num+" ");
			t.method();
		}
		System.out.println("---methodE End---");
	}
	public static Temp09 methodF() {
		Temp09 tt = new Temp09();
		tt.num=99;
		return tt;
	}
	public static Temp09[] methodG() {
		Temp09[] arr = new Temp09[3];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new Temp09();
			arr[i].num = i+1;
		}
		return arr;
	}
}

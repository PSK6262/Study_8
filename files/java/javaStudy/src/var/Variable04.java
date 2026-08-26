package var;

public class Variable04 {

	public static void main(String[] args) {
		String s1 = "1234";
		int n1 = 11;
		int n2 = 22;
		
		System.out.println(n1 + n2 + s1); // 33 + 1234
		System.out.println(s1 + n1 + n2); // "12" + 11 + 22
	
		int n3 = Integer.parseInt(s1);
		System.out.println(n3+16);
		String s3 = "33.55";
		double d4 = Double.parseDouble(s3);
		System.out.println(d4);
		
		boolean b1 = true;
		String s5 = "false";
		boolean b2 = Boolean.parseBoolean(s5);
		System.out.println(b2);
		
		String s10 = String.valueOf(true);
		String s11 = String.valueOf(123);
		String s12 = String.valueOf(133.568);
		System.out.println(s10);
		System.out.println(s11);
		System.out.println(s12);
	}
}

package var;

public class Variable03 {

	public static void main(String[] args) {
		
		// Type casting
		
		int i1 = 30;
		int i2 = i1;
//		int i3 = 3.11;
//		System.out.println(i1);
		double d1 = 3.11;
		double d2 = d1;
		
		double d3 = 40; // 40.0
		System.out.println(d3);
		
		char c1 = 'A';
		int i3 = c1;
		System.out.println(i3); // ascii
		char c2 = (char)i3;
		System.out.println(c2);
		
		double dd1 = 12.64;
		int ii1 = (int)dd1;
		System.out.println(ii1);
		
		float f1 = 1.1f;
		double dd2 = f1;
		
		int i10= 3;
		double d10 = 5;
		double d11 = i10 + d10;
		System.out.println(d11);
		
		int i12=10;
		double d12=5.5;
		int i13 = i12 + (int)d12;
		System.out.println(i13);
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		int result = (int)(dv1+dv2);
		System.out.println(result);
		result = (int)dv1 +(int)dv2;
		System.out.println(result);
		
		int x = 1; int y = 2;
		double result2 = (double)x/(double)y;
		System.out.println(result2);
		result2 = x/y;
		System.out.println(result2);
		
		
	}
}

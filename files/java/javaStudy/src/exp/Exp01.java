package exp;
import java.util.Scanner;

public class Exp01 {
	public static void main(String[] args) {
		
		TempCls tcl = null;
		if(tcl != null) tcl.t = 50;
		
		Scanner scanner = new Scanner(System.in);
		
//		int input = scanner.nextInt(); 
//		System.out.println("당신이 입력한 숫자 : " + input); // input = (String) -> runtime exception
		
//		try {
//			int tryInput = scanner.nextInt(); 
//			System.out.println("당신이 입력한 숫자 : " + tryInput);	
//		} catch (Exception e) {
//			System.out.println("error");
//		} 
//		System.out.println("outer space");
		
//		String s = scanner.nextLine();
//		try {
//			int n = Integer.parseInt(s);
//		} catch (Exception e) {
//			System.out.println("숫자로 입력");
//		} 
//		System.out.println("정상진행");
//		
//		
//		int n = 0;
//		try {
//			System.out.println("parseInt 전");
//			n = Integer.parseInt(s);
//			System.out.println("parseInt 후");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		} finally {
//			System.out.println("무조건실행");
//		}
		
		
		try {
			Class.forName("java.lang.String");
			Class.forName("java.lang.String123");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class TempCls {
	int t;
}
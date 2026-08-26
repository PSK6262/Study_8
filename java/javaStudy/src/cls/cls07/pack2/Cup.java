package cls.cls07.pack2;

public class Cup {
	//접근제한자
	//default : 같은 패키지까지만 접근 
	public String type;
	//public 으로 변경
		
	//void method() { //default 접근제한자
	public void method() { 
		System.out.println("pack2.Cup");
	}
}

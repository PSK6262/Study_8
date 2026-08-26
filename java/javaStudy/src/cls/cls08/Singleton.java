package cls.cls08;

public class Singleton {
	//Singleton singleton;
	//static Singleton singleton;
	//static Singleton singleton = new Singleton();
	//private static Singleton singleton = new Singleton();
	private static Singleton singleton;
	
	// private 접근제한자 -> 외부에서 접근 불가 
	// 외부에서 생성자 호출 불가 -> 외부에서 객체 생성 불가
	private Singleton() {
		//singleton = new Singleton();
	}
	
	//public Singleton getSingleton() {
//	public Singleton getInstance() {  //메소드명 변경
//		return this.singleton;
//	}
	
//	public static Singleton getInstance() { //static 으로 변경
//		return singleton;
//	}
	
	public static Singleton getInstance() { //static 으로 변경
		if(singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
	

	
	
	
	
}

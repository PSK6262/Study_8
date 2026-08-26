package cls.cls07.pack3;

public class PointMain {

	public static void main(String[] args) {
		
		//index 기준
		int[] mathArr;  // 1 2 3 
		int[] langArr;  // 1 2 3
		int[] engArr;   // 1 2 3 
		
		Point p1 = new Point();
		
		p1.math = 90;
		//p1.lang = 100;  private 접근제한자 -> 외부에서 접근 불가
		p1.eng = 50;
		
		p1.method1();
		p1.method2();
		//p1.method3();
		
		
		p1.math = 55;	//변수 직접 접근 값 저장
		System.out.println(p1.math); // setter 메소드를 통해서 값을 전달해서 값 저장
		
		p1.setMath(55);
		System.out.println(p1.getMath());
		
		//p1.lang = 100;    private 접근제한
		p1.setLang(100);
		//System.out.println(p1.lang);
		System.out.println(p1.getLang());
		
		//eng 60점
		p1.eng = 60;  // 점수 범위 0 ~ 100
		
		p1.eng = -50;  //직접접근 -> 잘못된 범위의 값
		System.out.println(p1.eng);
		p1.setEng(-50);
		System.out.println(p1.getEng());

//		System.out.println(p1.lang);
		System.out.println(p1.getLang());
		
		
		
	}

}


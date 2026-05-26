package be_study.cls.cls06;

public class LikePointMain {

	public static void main(String[] args) {

		int n = 10;
		System.out.println(n);
		
		n = 20;
		System.out.println(n);
		
		final int x = 30;
		System.out.println(x);
		//x = 300; //final 값 -> 초기화 이후 변경 불가
		
		System.out.println(LikePoint.staticX);
		//System.out.println(LikePoint.finalX);
		LikePoint lp1 = new LikePoint();
		System.out.println(lp1.finalX);
		
		LikePoint.staticX = 50;
		System.out.println(LikePoint.staticX);
		
		//lp1.finalX = 99;
		
		LikePoint lp2 = new LikePoint("선호도");
		System.out.println(lp2.category);
		//lp2.category = "흥미도";
		

		
		//어떤 기준이되는 상태값
		//enum 
		//상수형 변수 -> static final
		// 5  
		
		
		//객체생성없이 바로 사용가능
		System.out.println(LikePoint.VERY_GOOD);
		//LikePoint.VERY_GOOD = 10;  값 변경 불가
		System.out.println(LikePoint.VERY_BAD);
		System.out.println(LikePoint.NORMAL);
		
		int point = 3;
		
		if(point == LikePoint.NORMAL) {
			System.out.println("보통");
		}
		
		switch(point) {
		case LikePoint.VERY_GOOD:
		case LikePoint.GOOD:
		case LikePoint.NORMAL:
		case LikePoint.BAD:
		case LikePoint.VERY_BAD:
		}
	}

}

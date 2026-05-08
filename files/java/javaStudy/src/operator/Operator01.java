package operator;

public class Operator01 {

	public static void main(String[] args) {
		
		System.out.println( 1+1 );
		System.out.println( 10-5 );
		System.out.println( 5*9 );
		System.out.println( 30/7 );
		System.out.println( 30/7. );
		System.out.println( 9%5 );
		System.out.println( 28%9 );
		

		System.out.println( 10 );
		System.out.println( +10 );
		System.out.println( -10 );
		System.out.println( -(-10) );
		

		System.out.println("증감");
		int x = 10;
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		
		int y = 8;
		System.out.println(y--);
		System.out.println(--y);
		System.out.println(y);
		
		int q,w,e,r;
		q=1;
		w=3;
		e=10 + ++q;
		r = 3 + w--;
		
		System.out.printf("%d %d %d %d \n",q,w,e,r);
		
		System.out.println("논리부정");
		
		boolean isHungry = true;
		System.out.println(isHungry);
		System.out.println(!isHungry);
		System.out.println(!false);
		
		
		System.out.println("문자열 결합");
		System.out.println(133+2.22+"hi");

		System.out.println("비교");
		System.out.println( 1==2 );
		System.out.println( 1!=2 );
		System.out.println( 1<2 );
		System.out.println( 1>2 );
		System.out.println( 1==(int)1.5 );
		

		System.out.println("논리");

		System.out.println( true && false ); //and
		System.out.println( true || false ); //or
		
		System.out.println( false ^ false ); //xor
		System.out.println( true ^ false );
		System.out.println( false ^ true );
		System.out.println( true ^ true );
		
		System.out.println("대입");
		int a = 30;
		a = 50; a += 30;
		System.out.println(a);
		
		System.out.println("삼항");

		int point = 301;
		System.out.println((point>300) ? "맥주" : (point>200) ? "커피" : "생수");

		point = 201;
		System.out.println((point>300) ? "맥주" : (point>200) ? "커피" : "생수");

		point = 200;
		System.out.println((point>300) ? "맥주" : (point>200) ? "커피" : "생수");
		
		int num = -1;
		System.out.println(num<0 ? "음수": (num == 0) ? "0" : "양수" );
		
	}
}

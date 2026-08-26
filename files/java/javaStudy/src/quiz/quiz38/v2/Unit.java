package quiz.quiz38.v2;

abstract class Unit { // Unit 자체로는 의미 없으니까 객체를 만들 수 없게
		int x,y;
		abstract void move();
		void stop() {System.out.println("제자리 정지");}
}

package quiz.quiz38.v2;

class Marine extends Unit{
		@Override
		void move() {System.out.println("걸어서 이동");}
		void stimPack() {System.out.println("스팀팩 사용");} //스팀팩을 사용한다
	}
class Tank extends Unit{ // 탱크
		@Override
		void move() {System.out.println("바퀴를 굴려서 이동");}
		void changeMode() {System.out.println("공격모드 변환");} //공격모드를 변환한다
}
class Dropship extends Unit { // 수송선
		@Override
		void move() {System.out.println("날아서 이동");}
		void load() {System.out.println("대상 태우기");} //선택된 대상을 태운다
		void unload() {System.out.println("대상 내리기");} //선택된 대상을 내린다
}

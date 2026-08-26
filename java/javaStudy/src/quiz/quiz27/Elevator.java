package quiz.quiz27;

public class Elevator {
	public void main(String[] args) {
		// 변수 생성
		int a = 13;
		int b = 7;
		int c = 10;
		// 결과 출력
		System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
	}
	public static String guide(int floor) {
	if(floor < 1 || floor > 20) {
		System.out.println("층수 입력 오류");
		return null;
	}
		return (floor > 10) ? "고층" : "저층";
	}
}

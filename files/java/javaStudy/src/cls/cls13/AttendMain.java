package cls.cls13;

public class AttendMain {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("가가");
		s1.setStudentNumber(1);
		
		s1.setCard(new Card(11,"체크카드","가가","신한"));
	
		Student s2 = new Student();
		s2.setName("나나");
		s2.setStudentNumber(2);
		
		Card c2 = new Card(22,"신용카드","나나","국민");
		s2.setCard(c2);
		
		AttendTool tool = new AttendTool();
		tool.setOrg("트레이닝 학원");
		tool.powerOn();
		
		boolean result1 = tool.checkAttend(c2);
		if(result1) {
			System.out.println("출결처리 성공");
		} else {
			System.out.println("실패. 다시 시도하세요");
		}
		boolean result2 = tool.checkAttend(s1.getCard());
		
		int result3 = tool.checkAttendCode(s2.getCard());

		boolean result4 = tool.checkAttend(s1);
		boolean result5 = tool.checkAttend(s2);
	}
}

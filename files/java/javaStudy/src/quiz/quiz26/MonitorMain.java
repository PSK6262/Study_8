package quiz.quiz26;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		@7. 두 개의 모니터를 생성합니다. -> main 에서 객체 생성 new Monitor
//		1) 삼성 27인치 150,000 검은색
//		2) LG 32인치 330,000
		
		//Monitor m1 = new Monitor("삼성", 27, 150000, "검은색");
		Monitor m1 = new Monitor("삼성", 27, 150000);
		//m1.color = "검은색";
		m1.setColor("검은색");
		
		Monitor m2 = new Monitor("LG", 32, 330000);
		
		
		
//		@8. 모니터의 색상과 해상도가 결정되었습니다. -> 해상도값 저장 4번 생성한 set메소드 활용
//		1) 1080 * 780
//		2) 흰색, 4096 * 2048
		
		m1.setXY(1080, 780);
		
		m2.setXY(4096, 2048);
		m2.setColor("흰색");
		
		
		
		
//		@10. 1), 2) 모니터의 정보를 출력합니다. -> 9번활용 출력
		m1.printInfo();
		m2.printInfo();
		

//		@11. 2) 의 가격이 7만원 인상시키고, 그 결과 총금액을 받아서 출력합니다.
//			-> 6번,9번 메소드활용 (9번은...밑에 12번에서 출력을 다시 하니까...6번만해도..되겠군요)
		//int returnPrice = m2.addPrice(70000);
		//System.out.println("인상된 금액 : " + returnPrice);

		System.out.println("인상된 금액 : " + m2.addPrice(70000));
		
		//m2.addPrice(70000);
		//System.out.println(m2.price);
		
		
		
//		@ 12. 1), 2)에 해당하는 정보를 다시 출력합니다. -> 9번활용 출력
		m1.printInfo();
		m2.printInfo();
		
		
	}

}

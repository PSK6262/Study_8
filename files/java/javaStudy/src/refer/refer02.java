package refer;

public class refer02 {

	public static void main(String[] args) {
		
		//enum
		int likePoint = 50;
		
		likeIndex li1 = likeIndex.VERYGOOD; // 다른값 들어갈 염려 없음
		likeIndex li2 = likeIndex.GOOD;
		likeIndex li3 = likeIndex.NORMAL;
		likeIndex li4 = likeIndex.BAD;
		likeIndex li5 = likeIndex.VERYBAD;
		
		Week w = Week.MON;
		
		if(w == Week.MON) {
			System.out.println("오늘은 월요일");
		}

	}
}

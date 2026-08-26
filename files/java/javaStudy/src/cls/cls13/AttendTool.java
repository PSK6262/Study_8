package cls.cls13;
//출석체크 도구
public class AttendTool {
	private boolean isPowerOn; //전원 
	private String org; //어떤 조직
	
	
	
	public void powerOn() {
		isPowerOn = true;
		System.out.println(isPowerOn);
	}
	public boolean checkAttend(Card card) {
		System.out.println(card.getOwner()+" 소유의 "+card.getBrand()+"카드 출결 확인");
		return true; // 됐다 치고
	}
	public boolean checkAttend(Student student) {
		System.out.println("카드 소유주 : "+student.getCard().getOwner());
		System.out.println("카드 태그 학생 : " + student.getName());
		if(student.getCard().getOwner().equals(student.getName())) {
			return true;
		}
		return false;
	}
	public int checkAttendCode(Card card) {
		System.out.println(card.getOwner()+" 소유의 "+card.getBrand()+"카드 출결 확인");
		return 1;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
}

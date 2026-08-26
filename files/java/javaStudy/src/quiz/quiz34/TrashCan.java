package quiz.quiz34;

public class TrashCan {
	private int maxSize; // L단위
	private int trashSize; // 얼마나 찼냐 계산용, 문제엔X
	private String color;
	
	public double leftSpace() {
		double leftSpacePercentage = trashSize/maxSize;
		return leftSpacePercentage;
	}
	public void openTrashCan() {
		System.out.println("쓰레기통 열기");
	}
	public void closeTrashCan() {
		System.out.println("쓰레기통 닫기");
	}
	public void cleanTrashCan() {
		trashSize = 0;
	}
	public void addTrash(int trashSize) {
		if(this.trashSize + trashSize > maxSize) System.out.println("쓰레기통이 꽉 찼습니다.");
		else this.trashSize += trashSize;
	}
	public void setTrashSize(int trashSize) {
		if(trashSize > maxSize) System.out.println("쓰레기통이 꽉 찼습니다");
		else this.trashSize = trashSize;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getTrashSize() {
		return trashSize;
	}	
	public int getMaxSize() {
		return maxSize;
	}
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}
	
}

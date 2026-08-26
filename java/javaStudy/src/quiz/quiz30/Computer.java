package quiz.quiz30;

public class Computer {
	public String[] osType = {"윈도우10","애플 OS X","안드로이드"};
	private String os;
	private int memorySize;
	
	Computer(int osTypeNum, int memorySize){
		os = osType[osTypeNum];
		this.memorySize=memorySize;
	}
	void print() {
		System.out.println("운영체제: "+os+", 메인메모리: "+memorySize);
	}
	int getMemorySize() {
		return memorySize;
	}

	void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}

	String getOs() {
		return os;
	}

	void setOs(String os) {
		this.os = os;
	}
}

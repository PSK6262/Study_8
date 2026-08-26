package inherit.inherit01;

public class Child extends Parent {
	String school;
	int grade;
	
	Child(){
		//super(); // 부모 생성자 호출
		//this(); // 자체 생성자
		super(0);
		System.out.println("Child() 생성자 호출됨");
	}
	Child(String school, int grade){
		super(0); // 얘는 항상 먼저 호출 후
		//자식에서 할 일을 적어야한다.. 뒤에 나오면 오류남
		this.school = school;
		this.grade = grade;
	}
	
	void play() {
		System.out.println("나가서 뛰어 놀기");
	}
	void printInfo() {
		System.out.println(school + " "+grade+" "+money);
		System.out.println(age);
	}
}

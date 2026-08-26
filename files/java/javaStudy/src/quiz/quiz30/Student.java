package quiz.quiz30;

public class Student {
	private String department;
	private int number;
	
	Student(){
		department = "none";
		number = 0;
	}
	Student(String department,int number){
		this.department = department;
		this.number=number;
	}
	Student main() {
		Student s = new Student("Engineering",2);
		return s;
	}
	int getNumber() {
		return number;
	}
	void setNumber(int number) {
		this.number = number;
	}
	String getDepartment() {
		return department;
	}
	void setDepartment(String department) {
		this.department = department;
	}
}

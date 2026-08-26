package cls.cls01;

public class Student {
	
	private String name;
	private String phone;
	private String studentNumber;
	private int grade;
	Student(String name,String phone,String studentNumber,int grade){
		this.setName(name);
		this.setPhone(phone);
		this.setStudentNumber(studentNumber);
		this.setGrade(grade);
	}
	Student(){
	}
	int getGrade() {
		return grade;
	}
	void setGrade(int grade) {
		this.grade = grade;
	}
	String getStudentNumber() {
		return studentNumber;
	}
	void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	String getPhone() {
		return phone;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
}

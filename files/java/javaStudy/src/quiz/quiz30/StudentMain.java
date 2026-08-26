package quiz.quiz30;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setDepartment("Computer Science");
		s1.setNumber(1);
		
		Student s2=s1.main();
		
		System.out.println(s1.getDepartment() +" "+ s1.getNumber());
		System.out.println(s2.getDepartment() +" "+ s2.getNumber());
	}
}

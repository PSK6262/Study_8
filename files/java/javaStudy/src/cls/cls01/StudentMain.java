package cls.cls01;

public class StudentMain {

	public static void main(String[] args) {
		Student a = new Student("A","010-0000-0000","45-44108817",2);
		System.out.println(a.getGrade());
		
		Student stu1 = null;
		stu1 = new Student();
		
		stu1.setName("이름1");
		System.out.println(stu1.getName());
		stu1.setGrade(4);
		System.out.println(stu1.getGrade());
		stu1.setPhone("010-1010-0101");
		System.out.println(stu1.getPhone());
	}
}

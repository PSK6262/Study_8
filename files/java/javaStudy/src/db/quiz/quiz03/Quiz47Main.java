package db.quiz.quiz03;

import java.util.ArrayList;

public class Quiz47Main {
	public static void main(String[] args) {
		//ArrayList<Student> studList = StudentDAO.findStudentList();
		//ArrayList<Student> studList2 = StudentDAO.findStudentListbyGrade(1);
		
		//for(Student s : studList2) {
		//	System.out.println(s.toString());
		//}
		Student s = new Student();
		s.setStudno(9815);
		s.setName("Spring Summer");
		s.setId("Summer");
		s.setGrade(1);
		s.setJumin("1234561234567");
		s.setBirthday("88/12/31");
		s.setTel("055)000-9999");
		s.setHeight(175);
		s.setWeight(80);
		s.setDeptno1(101);
		s.setDeptno2(201);
		s.setProfno(2001);
		int rs = StudentDAO.addStudent(s);
		if(rs > 0) System.out.println("완료");
		else System.out.println("오류");
	}
}

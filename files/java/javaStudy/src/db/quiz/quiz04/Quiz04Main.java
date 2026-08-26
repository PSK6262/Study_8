package db.quiz.quiz04;

import java.util.ArrayList;

public class Quiz04Main {

	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();
		int deptno = 201;
		ArrayList<Student> studList = studentDAO.findStudentScoreAndGradeByDeptno(deptno);
		for(Student s : studList) {
			System.out.println(s);
		}
	}
}

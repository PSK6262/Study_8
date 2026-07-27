package db.v4;

public class DBSampleMain {
	public static void main(String[] args) {
		// student
		// department
		// join 구현 -> 1.각각 조회 + 객체전달 후 합치기 / 2. 처음부터 join 된 상태로 받기
		int pk = 9511; // 이전에 조회 -> pk값 9511 받음
		
		StudentDAO studentDAO = new StudentDAO();
		StudentDTO s1 = studentDAO.findStudentByStudno(pk);
		System.out.println(s1);
		
		DepartmentDAO departmentDAO = new DepartmentDAO();
		DepartmentDTO d1 = departmentDAO.findDepartmentByDeptno(s1.getDeptno1());
		System.out.println(d1);
		
		System.out.println(s1.getName() + " " + d1.getDname());
		// 이후 s1.getDeptno1() -> department 테이블의 pk니까 똑같이 조회
		// 여긴 join 이용
		StudentDTO sdDTO = studentDAO.findStudentMyPageByStudno(pk);
		System.out.println(sdDTO);
	
	}
}

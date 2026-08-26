package db.quiz.quiz04;

public class Student {
	private int studno;
	private String name;
	private String id;
	private int grade;
	private String jumin;
	private String birthday;
	private String tel;
	private int height;
	private int weight;
	private int deptno1;
	private int deptno2;
	private int profno;
	Student(){}
	public Student(int studno, String name, String id, int grade, String jumin, String birthday, String tel,
			int height, int weight, int deptno1, int deptno2, int profno) {
		super();
		this.studno = studno;
		this.name = name;
		this.id = id;
		this.grade = grade;
		this.jumin = jumin;
		this.birthday = birthday;
		this.tel = tel;
		this.height = height;
		this.weight = weight;
		this.deptno1 = deptno1;
		this.deptno2 = deptno2;
		this.profno = profno;
	}
	public int getProfno() {
		return profno;
	}
	public void setProfno(int profno) {
		this.profno = profno;
	}
	public int getDeptno2() {
		return deptno2;
	}
	public void setDeptno2(int deptno2) {
		this.deptno2 = deptno2;
	}
	public int getDeptno1() {
		return deptno1;
	}
	public void setDeptno1(int deptno1) {
		this.deptno1 = deptno1;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String string) {
		this.birthday = string;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	
	@Override
	public String toString() {
		return "Student [studno=" + studno + ", name=" + name + ", total=" + total + ", scoreGrade=" + scoreGrade + "]";
	}

	// score 담기
	private String total;
	
	String getTotal() {
		return total;
	}
	void setTotal(String total) {
		this.total = total;
	}
	// hakjum 담기
	private String scoreGrade;
	
	String getScoreGrade() {
		return scoreGrade;
	}
	void setScoreGrade(String scoreGrade) {
		this.scoreGrade = scoreGrade;
	}
	
}

package db.v3;

//import java.time.LocalDateTime;

//Data Transfer Object
public class ProfessorDTO {
	private int profno;
	private String name;
	private String id;
	private String position;
	private int pay;
	//LocalDateTime hiredate;
	private String hiredate;
	private String email;
	private String hpage;
	private int bonus;
	private int deptno;
	
	ProfessorDTO(){
		
	}
	int getDeptno() {
		return deptno;
	}
	void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	int getBonus() {
		return bonus;
	}
	void setBonus(int bonus) {
		this.bonus = bonus;
	}
	String getHpage() {
		return hpage;
	}
	void setHpage(String hpage) {
		this.hpage = hpage;
	}
	String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email = email;
	}
	String getHiredate() {
		return hiredate;
	}
	void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	int getPay() {
		return pay;
	}
	void setPay(int pay) {
		this.pay = pay;
	}
	String getPosition() {
		return position;
	}
	void setPosition(String position) {
		this.position = position;
	}
	String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getProfno() {
		return profno;
	}
	void setProfno(int profno) {
		this.profno = profno;
	}
}

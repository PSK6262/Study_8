package db.quiz.quiz02;

public class Professor {
	private int profno;
	private String name;
	private String id;
	private String position;
	private int pay;
	private int deptno;
	public Professor() {}
	public Professor(int profno, String name, String id, String position, int pay, int deptno) {
		super();
		this.setProfno(profno);
		this.setName(name);
		this.setId(id);
		this.setPosition(position);
		this.setPay(pay);
		this.setDeptno(deptno);
	}
	int getDeptno() {
		return deptno;
	}
	void setDeptno(int deptno) {
		this.deptno = deptno;
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
	@Override
	public String toString() {
		return "Professor [profno=" + profno + ", name=" + name + ", id=" + id + ", position=" + position + ", pay="
				+ pay + ", deptno=" + deptno + "]";
	}
}

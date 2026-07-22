package db.v1;

public class Dept {
	private int deptno;
	private String dname;
	private String loc;
	String getLoc() {
		return loc;
	}
	void setLoc(String loc) {
		this.loc = loc;
	}
	String getDname() {
		return dname;
	}
	void setDname(String dname) {
		this.dname = dname;
	}
	int getDeptno() {
		return deptno;
	}
	void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

}

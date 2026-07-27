package db.v4;

public class DepartmentDTO {
	private String deptno;
	private String dname;
	private String part;
	private String build;
	public DepartmentDTO() {}
	public DepartmentDTO(String deptno, String dname, String part, String build) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.part = part;
		this.build = build;
	}
	public String getBuild() {
		return build;
	}
	public void setBuild(String build) {
		this.build = build;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "DepartmentDTO [deptno=" + deptno + ", dname=" + dname + ", part=" + part + ", build=" + build + "]";
	}
}

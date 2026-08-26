package db.v2;

import java.util.ArrayList;

public class DBSampleMain {
	public static void main(String[] args) {
		DeptDAO deptDAO = new DeptDAO();
		/*
		Dept dept1 = deptDAO.findDeptByDeptno(30);
		if(dept1 != null) System.out.println(dept1.toString());
		
		ProductDAO productDAO = new ProductDAO();
		ArrayList<Product> productList = productDAO.findProductAll();
		if(productList.size() != 0 && productList != null)
			for(Product p : productList) {
				System.out.println(p.toString());
			}
		//System.out.println(deptDAO.saveDept3(4009, "a",1000,"b"));
		//System.out.println(deptDAO.saveDept(80, "a","b"));
		
		Dept saveDept1 = new Dept(191,"Adv","Busan");
		System.out.println(deptDAO.saveDept(saveDept1));
		System.out.println(deptDAO.removeDept(80));
		
		ArrayList<Dept> saveDeptList = new ArrayList<>();
		saveDeptList.add(new Dept(81,"dn81","loc81"));
		saveDeptList.add(new Dept(82,"dn82","loc82")); 
		saveDeptList.add(new Dept(83,"dn83","loc83"));
		
		for(Dept d : saveDeptList) {
			System.out.println(deptDAO.saveDept(d));
		}
		*/
		// 기존 값 조회 -> 일부 변경 -> 변경사항 반영
		Dept up1 = deptDAO.findDeptByDeptno(81);
		//81 , dn81 , loc81
		up1.setLoc("ASAN");
		System.out.println(deptDAO.modifyDept(up1));
		
		Dept up2 = new Dept(82, "LAW", "");
		System.out.println(deptDAO.modifyDept(up2));
		
		Dept up3 = new Dept(83,null,"ULSAN");
		System.out.println(deptDAO.modifyDept(up3));
		
		Dept up4 = new Dept(81,"FREE","ASAN");
		System.out.println(deptDAO.modifyDept(up4));
	}
}

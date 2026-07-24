package db.v2;

import java.util.ArrayList;

public class DBSampleMain {
	public static void main(String[] args) {
		
		DeptDAO deptDAO = new DeptDAO();
		
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
		
//		Dept saveDept1 = new Dept(191,"Adv","Busan");
//		System.out.println(deptDAO.saveDept(saveDept1));
		System.out.println(deptDAO.removeDept(80));
	}
}

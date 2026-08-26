package coll;

import java.util.ArrayList;
import java.util.List;

public class Collection01 {
	public static void main(String[] args) {
		String s1 = "A";
		String s2 = "B";
		
		String[] sArr = new String[3];
		sArr[0] = "A";
		sArr[1] = "B";
		sArr[2] = "C";
		
		for(int i=0; i<sArr.length;i++) {
			System.out.print(sArr[i]+ " ");
		}
		System.out.println();
		
		for(String s : sArr) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		List<String> list1 = new ArrayList<>();
		list1.add("D");
		list1.add("E");
		list1.add("F");
		for(int i=0;i<list1.size();i++) {
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
		for(String s : list1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		List<String> list2 = null;
		try {
			list2.add("G"); // null pointer exception
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		list1.add("G");
		for(String s : list1) {
			System.out.print(s + " ");
		}
		System.out.println();
		list1.add(2,"H"); // index의 위치에 들어가고 뒤를 밀어버림.
		list1.set(1, "I"); // 덮어쓰기
		for(String s : list1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		list1.remove(0); // index = 0 지우기
		list1.remove("H"); // value = "H" 지우기
		for(String s : list1) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		//--------
		int n1 = 10;
		int n2 = 20;
		int[] nArr = new int[5];
		
		List<Integer> list3 = new ArrayList<>(); // int X Integer(Wrapper Class) O , 참조타입만 가능함
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		System.out.println(list3.size());
		System.out.println(list3.isEmpty());
		System.out.println(list3.indexOf(list3));
		System.out.println(list3.contains(40));
		System.out.println(list3.contains(50));
		for(int i : list3) {
			System.out.print(i + " ");
		}
		System.out.println();
	
	
	}
}

package cls.cls10;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		//Array
		String[] sArr1 = new String[4];
		sArr1[0] = "A";
		sArr1[1] = "B";
		sArr1[2] = "C";
		sArr1[3] = "D";
		
		//sArr1[4] = "E"; //불가능
		
		String[] sArr2 = new String[5];
		
		for(int i=0;i<sArr1.length;i++) {
			sArr2[i] = sArr1[i];
		}
		sArr2[4] = "E";
		
		for(String s : sArr2) System.out.print(s + " ");
		
		System.out.println();
		//ArrayList
		ArrayList<String> sList = new ArrayList<String>();
		ArrayList<Integer> iList = new ArrayList<Integer>();
		sList.add("A");
		sList.add("B");
		sList.add("C");
		sList.add("D");
		sList.add("E");
		
		for(String s : sList) System.out.print(s + " ");
		System.out.println();
		for(int i=0;i<sList.size();i++) System.out.print(sList.get(i)+" ");
		System.out.println(sList.contains("B"));
		sList.remove(1);
		sList.remove("C");
		for(String s : sList) System.out.print(s + " ");
	}
}

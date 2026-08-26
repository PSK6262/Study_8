package cls.cls10;

import java.util.ArrayList;

import cls.cls09.Temp09;

public class ClassListMain {

	public static void main(String[] args) {
		//Array
		Temp09[] tArr = new Temp09[3];
		//ArrayList
		ArrayList<Temp09> tList = new ArrayList<Temp09>();
		
		tList.add(new Temp09());
		tList.add(new Temp09());
		tList.add(new Temp09());
		tList.add(new Temp09());
		
		for(int i=0;i<tList.size();i++) {
			System.out.print(tList.get(i).num + " ");
			//tList 리스트
			//tList.get(i) Temp09객체
			//tList.get(i).num      의 필드변수num
		}
		for(Temp09 t : tList) {
			System.out.print(t.num + " ");
			t.method();
		}
		System.out.println();
		
		printList(tList);
		ArrayList<Temp09> resultList = generateList();
		printList(resultList);
	}
	public static void printList(ArrayList<Temp09> tList) {
		System.out.println("---printList start---");
		for(Temp09 t : tList) {
			System.out.print( t.num + " ");
			t.method();
		}
		System.out.println("---printList end---");
	}
	public static ArrayList<Temp09> generateList(){
		ArrayList<Temp09> list = null;
		list = new ArrayList<Temp09>();
		Temp09 t = new Temp09();
		t.num=10;
		
		list.add(t);
		return list;
	}
}

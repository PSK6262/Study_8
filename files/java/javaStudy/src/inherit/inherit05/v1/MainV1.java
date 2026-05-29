package inherit.inherit05.v1;

import java.util.ArrayList;

public class MainV1 {

	public static void main(String[] args) {

//		DustCleaner c1 = new DustCleaner();
//		DustCleaner c2 = new DustCleaner();
//		DustCleaner c3 = new DustCleaner();
//		c1.removeDust();
//		c2.removeDust();
//		c3.removeDust();
		
		DustCleaner[] dArr = new DustCleaner[3];
		for(int i=0;i<dArr.length;i++) {
			dArr[i]=new DustCleaner();
			dArr[i].removeDust();
		}
		
		ArrayList<FloorCleaner> fList = new ArrayList<>();
		fList.add(new FloorCleaner());
		fList.add(new FloorCleaner());
		fList.add(new FloorCleaner());
		
		ArrayList<WindowCleaner> wList = new ArrayList<>();
		wList.add(new WindowCleaner());
		wList.add(new WindowCleaner());
		wList.add(new WindowCleaner());
	}
}

package inherit.inherit05.v2;

import java.util.ArrayList;
import java.util.List;

public class MainV2 {

	public static void main(String[] args) {

		Cleaner c1 = new Cleaner();
		Cleaner c2 = new DustCleaner();
		Cleaner c3 = new FloorCleaner();
		Cleaner c4 = new WindowCleaner();
		
		DustCleaner dc = new DustCleaner();
		//dc.cleanFloor();
		
		List<Cleaner> list = new ArrayList<>();
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		
		for(Cleaner c : list) {
			c.removeDust();
			c.cleanFloor();
			c.washWindow();
		}
	}
}

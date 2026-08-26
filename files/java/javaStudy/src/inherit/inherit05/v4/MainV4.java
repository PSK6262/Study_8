package inherit.inherit05.v4;

import java.util.ArrayList;
import java.util.List;

public class MainV4 {

	public static void main(String[] args) {

		Cleaner c1 = new Cleaner();
		Cleaner c2 = new DustCleaner();
		Cleaner c3 = new FloorCleaner();
		Cleaner c4 = new WindowCleaner();
		
		DustCleaner dc = new DustCleaner();
		DustCleaner dc2 = (DustCleaner)c2;
		
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
			c.doClean(); // 각자 재정의된 기능을 실행함.
		}
		// 동일 실행 -> 다른 결과 // 다형성
	}
}

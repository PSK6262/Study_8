package inherit.inherit04;

import java.util.ArrayList;
import java.util.List;

import inherit.inherit03.BluetoothMike;
import inherit.inherit03.Mike;
import inherit.inherit03.WirelessMike;

public class Inherit04Main {
	public static void main(String[] args) {
		Mike m1 = new Mike();
		BluetoothMike bm1 = new BluetoothMike();
		WirelessMike wm1 = new WirelessMike();
		
		m1.volumeUp();
		bm1.volumeUp();
		wm1.volumeUp();
		
		Mike m2 = bm1;
		Mike m3 = wm1;
		Mike m4 = new BluetoothMike();
		Mike m5 = new WirelessMike();
		
		Mike[] mArr = {m1,m2,m3,m4,m5};
		System.out.println();
		for(int i=0;i<mArr.length;i++) {
			mArr[i].volumeUp();
		}
		System.out.println();
		
		ArrayList<Mike> mList = new ArrayList<Mike>();
		mList.add(m1);
		mList.add(m2);
		mList.add(m3);
		mList.add(m4);
		mList.add(m5);
		for(Mike m : mList) {
			m.volumeUp();
		}
		
		
		List<Mike> mList2 = new ArrayList<Mike>();
		
	}
}

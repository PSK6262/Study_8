package cls.cls12;

import java.util.ArrayList;

public class ClassRoomMain {

	public static void main(String[] args) {
		ClassRoom room1 = new ClassRoom();
		room1.setFloor(7);
		room1.setRoomNumber(3);
		room1.setRoomSize(66.7);
		room1.setHasWhiteBoard(true);
		
		WhiteBoard wb = new WhiteBoard();
		wb.setSizeX(1600);
		wb.setSizeY(900);
		wb.setPrice(200000);
		wb.setMagnetic(true);
		room1.setWhiteBoard(wb);
		
		AirCon ac = new AirCon();
		room1.setAirCon(ac);
		
		ArrayList<Desk> deskList  = new ArrayList<>();
		
		for(int i=0;i<=10;i++) deskList.add(new Desk(800,600,"blue"));
		
		room1.setDeskList(deskList);
		
		room1.addDesk(new Desk(2000,1200,"oak"));
		//------------------
		ClassRoom room2 = new ClassRoom(wb,ac);
		room2.addDesk(new Desk(2000,1200,"oak"));
		room2.addDesk(1000,800,"white");
	}
}

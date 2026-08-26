package cls.cls12;

import java.util.ArrayList;

public class ClassRoom {

	private int floor;
	private int roomNumber;
	private double roomSize;
	private boolean hasWhiteBoard;
	
	private AirCon airCon;
	private WhiteBoard whiteBoard;
	private ArrayList<Desk> deskList;
	
	public ClassRoom() {
		setFloor(0);
		setRoomNumber(0);
		setHasWhiteBoard(false);
		setWhiteBoard(null);
		setAirCon(null);
		setDeskList(new ArrayList<Desk>());
	}
	public ClassRoom(int floor, int roomNumber) {
		this.setFloor(floor);
		this.setRoomNumber(roomNumber);
	}
	public ClassRoom(WhiteBoard whiteboard,AirCon airCon) {
		this.setWhiteBoard(whiteBoard);
		this.setAirCon(airCon);
	}
	ArrayList<Desk> getDeskList() {
		return deskList;
	}
	void setDeskList(ArrayList<Desk> deskList) {
		this.deskList = deskList;
	}
	void addDesk(Desk desk) {
		if(deskList == null) {
			deskList = new ArrayList<Desk>();
		}
		this.deskList.add(desk);
	}
	void addDesk(int sizeX,int sizeY, String color) {
		Desk d = new Desk(sizeX,sizeY,color);
		if(deskList == null) {
			deskList = new ArrayList<Desk>();
		}
		this.deskList.add(d);
	}
	WhiteBoard getWhiteBoard() {
		return whiteBoard;
	}
	void setWhiteBoard(WhiteBoard whiteBoard) {
		this.whiteBoard = whiteBoard;
	}
	AirCon getAirCon() {
		return airCon;
	}
	void setAirCon(AirCon airCon) {
		this.airCon = airCon;
	}
	boolean isHasWhiteBoard() {
		return hasWhiteBoard;
	}
	void setHasWhiteBoard(boolean hasWhiteBoard) {
		this.hasWhiteBoard = hasWhiteBoard;
	}
	double getRoomSize() {
		return roomSize;
	}
	void setRoomSize(double roomSize) {
		this.roomSize = roomSize;
	}
	int getRoomNumber() {
		return roomNumber;
	}
	void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	int getFloor() {
		return floor;
	}
	void setFloor(int floor) {
		this.floor = floor;
	}
}

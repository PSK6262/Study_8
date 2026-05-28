package quiz.quiz34;

public class DiningRoom {
	private int roomSize; // 단위 : 평
	private int floorHeight;
	private String wallpaperColor;
	private TrashCan[] trashcan;
	private Cup[] cup;
	
	public Cup[] getCup() {
		return cup;
	}
	public void setCup(Cup[] cup) {
		this.cup = cup;
	}
	public TrashCan[] getTrashcan() {
		return trashcan;
	}
	public void setTrashcan(TrashCan[] trashcan) {
		this.trashcan = trashcan;
	}
	public String getWallpaperColor() {
		return wallpaperColor;
	}
	public void setWallpaperColor(String wallpaperColor) {
		this.wallpaperColor = wallpaperColor;
	}
	public int getFloorHeight() {
		return floorHeight;
	}
	public void setFloorHeight(int floorHeight) {
		this.floorHeight = floorHeight;
	}
	public int getRoomSize() {
		return roomSize;
	}
	public void setRoomSize(int roomSize) {
		this.roomSize = roomSize;
	}
}

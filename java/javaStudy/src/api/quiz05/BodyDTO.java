package api.quiz05;

import java.util.ArrayList;

public class BodyDTO {
	private int totalCount;
	private ArrayList<ItemsDTO> items;
	private int pageNo;
	private int numOfRows;
	
	@Override
	public String toString() {
		return "BodyDTO [totalCount=" + getTotalCount() + ", items=" + getItems() + ", pageNo=" + getPageNo() + ", numOfRows="
				+ getNumOfRows() + "]";
	}
	public int getNumOfRows() {
		return numOfRows;
	}
	public void setNumOfRows(int numOfRows) {
		this.numOfRows = numOfRows;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public ArrayList<ItemsDTO> getItems() {
		return items;
	}

	public void setItems(ArrayList<ItemsDTO> items) {
		this.items = items;
	}


	public int getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
}

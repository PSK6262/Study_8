package api.quiz04;

import java.util.ArrayList;

public class OrdersDTO {
	private String orderId;
	private String date;
	private ArrayList<ItemsDTO> items;

	public ArrayList<ItemsDTO> getItems() {
		return items;
	}
	public void setItems(ArrayList<ItemsDTO> items) {
		this.items = items;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "OrdersDTO [orderId=" + orderId + ", date=" + date + ", items=" + items + "]";
	}
}

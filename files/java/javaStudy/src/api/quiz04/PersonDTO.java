package api.quiz04;

import java.util.ArrayList;

public class PersonDTO {
	private int id;
	private String name;
	private ArrayList<ContactDTO> contacts;
	private AddressDTO address;
	private ArrayList<OrdersDTO> orders;
	
	public ArrayList<OrdersDTO> getOrders() {
		return orders;
	}
	public void setOrders(ArrayList<OrdersDTO> orders) {
		this.orders = orders;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	public ArrayList<ContactDTO> getContacts() {
		return contacts;
	}
	public void setContacts(ArrayList<ContactDTO> contacts) {
		this.contacts = contacts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", name=" + name + ", contacts=" + contacts + ", address=" + address
				+ ", orders=" + orders + "]";
	}
	
}

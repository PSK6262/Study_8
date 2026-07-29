package api.quiz04;

public class AddressDTO {
	private String street;
	private String city;
	private String zipcode;
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public String toString() {
		return "AddressDTO [street=" + street + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	
}

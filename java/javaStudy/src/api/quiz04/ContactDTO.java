package api.quiz04;

public class ContactDTO {
	private String type;
	private String value;
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "ContactDTO [type=" + type + ", value=" + value + "]";
	}
}

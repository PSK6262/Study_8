package db.quiz.quiz01;

public class Product {
	private int p_code;
	private String p_name;
	private int p_price;
	int getP_price() {
		return p_price;
	}
	void setP_price(int p_price) {
		this.p_price = p_price;
	}
	String getP_name() {
		return p_name;
	}
	public Product(int p_code, String p_name, int p_price) {
		super();
		this.p_code = p_code;
		this.p_name = p_name;
		this.p_price = p_price;
	}
	void setP_name(String p_name) {
		this.p_name = p_name;
	}
	int getP_code() {
		return p_code;
	}
	void setP_code(int p_code) {
		this.p_code = p_code;
	}
	@Override
	public String toString() {
		return "[[P_CODE] : "+ p_code + " , [P_NAME] : " + p_name + " , [P_PRICE] : "+ p_price+"]";
	}
}

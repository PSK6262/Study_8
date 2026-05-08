package quiz;

public class quiz4 {

	public static void main(String[] args) {

		int menuPrice = 6000;
		String result = (menuPrice > 12000) ? "물로배채우기" : (menuPrice > 8000) ? "눈물" : (menuPrice > 6000) ? "선방" : "훌륭";
		System.out.println(result);
	}
}
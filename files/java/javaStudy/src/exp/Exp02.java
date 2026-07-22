package exp;
public class Exp02 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		try {
			arr = null;
			arr[5] = 10; // null pointer exception
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Arr Exception");
		} catch (NullPointerException e){
			e.printStackTrace();
			System.out.println("Null Exception");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception");
		} finally {
			System.out.println("finally");
		}
	}
}

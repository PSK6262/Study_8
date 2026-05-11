package cond;

public class Cond03 {

	public static void main(String[] args) {
		
		int dice = 5;
		
		if(dice == 1) {
			System.out.println("1칸 전진");	
		} else if(dice == 2) {
			System.out.println("2칸 전진");
		} else if(dice == 3) {
			System.out.println("3칸 전진");
		} else if(dice == 4) {
			System.out.println("4칸 전진");
		} else if(dice == 5) {
			System.out.println("5칸 전진");
		} else {
			System.out.println("6칸 전진");
		}
		
		switch (dice) {
			case 1: 
				System.out.println("1칸 전진");
				break;
			case 2:
				System.out.println("2칸 전진");
				break;
			case 3:
				System.out.println("3칸 전진");
				break;
			case 4:
				System.out.println("4칸 전진");
				break;
			case 5:
				System.out.println("5칸 전진");
				break;
			case 6:
				System.out.println("6칸 전진");
				break;
		}
	}
}

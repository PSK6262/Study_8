package cond;

public class Cond04 {

	public static void main(String[] args) {
		int bedTime = 23;
		int sleepTime = 5;
		
		if(bedTime<=21){
			if(sleepTime<=8) {
				System.out.println("일찍 적게");
			}
			else {
				System.out.println("일찍 많이");
			}
		} else {
			if(sleepTime>8) {
				System.out.println("늦게 많이");
			}
			else {
				System.out.println("늦게 적게");
			}
		}
		
	}
}

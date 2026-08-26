package random;

import java.util.Random;

public class Rand01 {
	public static void main(String args[]) {
		
		int count = 100;
		while(true) {
			int rand = (int)(Math.random()*count) + 1;
			System.out.println(rand);
			if(rand==7 || rand==77) break;
		}
		Random rand = new Random();
		
		System.out.println(rand.nextInt(10)); // 0 <= v < 10
		System.out.println(rand.nextInt(10,16)); // 10 <= v < 16
	}
}

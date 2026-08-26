package quiz;

import java.util.Scanner;

public class quiz23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pCount;
		while(true) {
			System.out.print("탑승 인원 : ");
			pCount = scan.nextInt();
			if(pCount <= 0 || pCount > 100)
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			else break;
			System.out.println();
		}
		int[] eArr = new int[pCount];

		while(eArr[pCount-1] == 0) {
			for(int i=0;i<pCount;i++) {
				eArr[i] = scan.nextInt();
				if(eArr[i] <= 1 || eArr[i] > 100) {
					System.out.println("다시 처음부터 입력해주세요.");
					break;
				}
			}
		}
		for(int i=1;i<pCount;i++) {
			for(int j=0;j<pCount-i;j++) {
				if(eArr[j] > eArr[j+1]){
					int temp = eArr[j];
					eArr[j] = eArr[j+1];
					eArr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<eArr.length;i++)
			System.out.println(eArr[i]+"층에 도착했습니다. ");
		if(eArr[pCount-1] != 100)
			System.out.println("100층에 도착했습니다."); // 가는동안 n명의 내릴 위치 n번 내려주고 100층찍고 1층 내려온다. 마지막이 100층이었으면 바로 1층
		System.out.println("1층에 도착했습니다.");
	}
}

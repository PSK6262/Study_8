package quiz;

import java.util.Random;
import java.util.Scanner;

public class quiz23_level2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int pCount,pLimits;
		int weightLimits;
		int weightSum = 0;
		int stopCount;
		while(true) {
			System.out.print("탑승 인원 : ");
			pCount = scan.nextInt();
			System.out.print("무게 제한 : ");
			weightLimits = scan.nextInt();
			System.out.print("인원 제한 : ");
			pLimits = scan.nextInt();
			System.out.print("최대 이동 횟수 : ");
			stopCount = scan.nextInt();
			if(pCount <= 0 || pCount > 100 || stopCount <= 1 || weightLimits <= 0 || pLimits <= 1) // 나누면 더 낫지만 일단은 코드 편의를 위해서
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			else break;
			System.out.println();
		}
		int[] pWeight = new int[pCount];
		for(int i=0;i<pWeight.length;i++) {
			pWeight[i] = rand.nextInt(40,150)+1;
			System.out.print((i+1)+"번째 사람의 무게 : "+pWeight[i]+"kg");
			System.out.println();
			weightSum += pWeight[i];

			if(pCount >= pLimits && i-1 == pLimits-1) {
				System.out.println("정원 초과로 인해 "+(pLimits)+"번째 사람 까지만 탑승 가능합니다.");
				pCount = pLimits;
				break;
			}
			else if(weightSum >= weightLimits) {
				System.out.println("중량 초과로 인해 "+i+"번째 사람 까지만 탑승 가능합니다.");
				pCount = i;
				break;
			}
		}
		int[] eArr = new int[pCount];

		while(eArr[pCount-1] == 0) {
			System.out.print("층수 입력 : ");
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
		if(stopCount < eArr.length) {
			for(int i=0;i<stopCount;i++)
				System.out.println(eArr[i]+"층에 도착했습니다. ");
			System.out.println("전기공급의 한계로, 계단으로 올라가시길 바랍니다.");
			System.out.println(eArr[stopCount-1]+"층 에서 시스템 점검중.");
		}
			
		else {
			for(int i=0;i<eArr.length;i++)
				System.out.println(eArr[i]+"층에 도착했습니다. ");
			if(eArr[pCount-1] != 100)
				System.out.println("100층에 도착했습니다."); // 가는동안 n명의 내릴 위치 n번 내려주고 100층찍고 1층 내려온다. 마지막이 100층이었으면 바로 1층
			if(stopCount == pCount+1 && eArr[pCount-1] != 100) { // n명이 n번 내린 이후에 100층갔다 1층 가는데, stopCount가 pCount+1이면 100층에서 멈춰야 맞음.
																 // 100층이 마지막 층이니까 계단따라 올라가라는 말은 필요없겠지요.
				System.out.println("100층에서 시스템 점검 중.");
				return ;
			}
			System.out.println("1층에 도착했습니다."); // stopCount > pCount + 1이면 1층까지 내려오는데 아무 이상 없음.
		}
	}
}

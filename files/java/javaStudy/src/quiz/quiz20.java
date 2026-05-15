package quiz;

import java.util.Scanner;

public class quiz20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] mName = {"아메리카노","카페라떼","바닐라라떼"};
		String mContinue = "y";
		int[] mPrice = {3500,4100,4300};
		int[] receipt = {0,0,0};
		int mCount;
		int mSelect;
		
		while(mContinue.equals("y")) {
			System.out.println("======== 메뉴 ========");
			for(int i=0;i<mName.length;i++) {	
				System.out.printf("%d. %6s   %6d원",(i+1),mName[i],mPrice[i]);
				System.out.println();
			}
			System.out.println("=====================");
			System.out.print("메뉴 선택 : ");
			mSelect = scan.nextInt();
			if(mSelect < 0 || mSelect > 3) {
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				continue;
			}
			System.out.print("수량 선택 : ");
			mCount = scan.nextInt();
			if(mCount < 0) { 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			receipt[mSelect-1] += mCount;
			
			scan.nextLine();
			System.out.print("추가 주문하시겠습니까?(y/n) : ");
			mContinue = scan.nextLine();
			System.out.println();
		}
		int sum = 0;
		System.out.println("=====================");
		for(int i=0;i<receipt.length;i++) {
			System.out.printf("%s %d잔 : %d원",mName[i],receipt[i],mPrice[i]*receipt[i]);
			System.out.println();
			sum += mPrice[i]*receipt[i];
		}
		System.out.println("=====================");
		System.out.printf("총액 : %d원",sum);
	}
}
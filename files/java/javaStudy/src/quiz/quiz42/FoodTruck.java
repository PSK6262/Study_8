package quiz.quiz42;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodTruck {
	int income = 0;
	ArrayList<Menu> menu = new ArrayList<>();
	
	public void openFoodTruck() { // 푸드트럭 오픈
		int select = 0;
		while(select != 4) {
			System.out.println("-----포장마차 오픈-----");
			System.out.println("1. 메뉴 보기");
			System.out.println("2. 주문 하기");
			System.out.println("3. 재고 관리");
			System.out.println("4. 마감 하기");
			System.out.println("--------------------");
			System.out.print("입력 : ");
			switch(select = selectNumber()) {
					case 1: showMenu();
							   break;
					case 2: orderMenu();
							   break;
					case 3: menuManagement();
						       break;
					case 4: shutDownFoodTruck();
							   break;
					default: errMessage(FoodTruckCode.GENERAL_ERROR);
							   break;
			}
		}
	}
	public void showMenu() {
		if(menu.size() == 0) {
			errMessage(FoodTruckCode.QUANTITY_ERROR);
			System.out.println("메뉴 선택으로 돌아갑니다.");
			System.out.println();
			openFoodTruck();
		} 
		else {
			System.out.println("--------------------");
			for(int i=0;i<menu.size();i++) {
				System.out.println((i+1)+"."+menu.get(i).getName()+" : "+menu.get(i).getPrice()+"원 // 재고"
						+ menu.get(i).getQuantitiy()+"개");
			}
			System.out.println("--------------------");
		}
		System.out.println();
	}
	public void orderMenu() { // 주문받기
		showMenu();
		int n,m;
		System.out.println("주문할 물건 번호");
		n = selectNumber();
		n = n-1; // index와 value의 차이 보정
		System.out.println("개수 입력");
		m = selectNumber();
		if(menu.get(n) != null) {
			if(menu.get(n).getQuantitiy()-m >= 0) {
				income += menu.get(n).getPrice() * m; // 수입 계산
				int left = menu.get(n).getQuantitiy() - m; // 개수 계산
				menu.get(n).setQuantitiy(left);
			}
			else {
				errMessage(FoodTruckCode.QUANTITY_ERROR);
				orderMenu();
			}
		}
		else {
			errMessage(FoodTruckCode.NUMBER_ERROR);
			orderMenu();
		}
	}
	public void menuManagement() {
		System.out.println("추가할 메뉴의 이름을 입력하세요.");
		String s = selectString();
		System.out.println("추가할 메뉴의 가격을 입력하세요.");
		int p = selectNumber();
		System.out.println("추가할 메뉴의 개수를 입력하세요.");
		int q = selectNumber();
		int result = addMenu(s,p,q);
		
		if(result == FoodTruckCode.NO_ERROR) System.out.println("추가되었습니다.");
		else if(result == FoodTruckCode.QUANTITY_INPUT_ERROR) {
			errMessage(FoodTruckCode.QUANTITY_INPUT_ERROR);
			menuManagement();
		}
		else if(result == FoodTruckCode.PRICE_ERROR) {
			errMessage(FoodTruckCode.PRICE_ERROR);
			menuManagement();
		}
		System.out.println();
	}
	public void shutDownFoodTruck() { // 문닫기
		if(income != 0) {
			int cost = costPriceCalculate();
			System.out.println("마감 완료");
			System.out.println("벌어들인 금액 : "+income);
			System.out.println("폐기로 인한 손해 : "+cost);
			System.out.println("총 벌어들인 금액 : "+(income-cost));
		}
		else {
			System.out.println("오늘은 쉽니다.");
		}
		return;
	}
	public void errMessage(int errNum) {
		if(errNum == FoodTruckCode.GENERAL_ERROR)
			System.out.println("잘못된 입력입니다. 재입력 해주세요. errorcode : -1");
		else if(errNum == FoodTruckCode.QUANTITY_ERROR)
			System.out.println("재고 오류, 재입력 해주세요 errorcode : -2");
		else if(errNum == FoodTruckCode.PRICE_ERROR)
			System.out.println("가격 오류. 재입력 해주세요 errorcode : -3");
		else if(errNum == FoodTruckCode.NUMBER_ERROR)
			System.out.println("번호 오류. 재입력 해주세요. errorcode : -4");
		else if(errNum == FoodTruckCode.QUANTITY_INPUT_ERROR)
			System.out.println("개수 오류. 재입력 해주세요. errorcode : -5");
	}
	public int addMenu(String menuName,int price,int quantity) { // 메뉴 추가
		if(price > 0) {
			if(quantity >0) {
				Menu m = new Menu(menuName,price,quantity);
				menu.add(m);
				return FoodTruckCode.NO_ERROR;
			}
			else return FoodTruckCode.QUANTITY_INPUT_ERROR;
		} 
		else return FoodTruckCode.PRICE_ERROR;
	}
	public int costPriceCalculate() { // 원가계산
		int cost = 0;
		int leftQuantity;
		for(int i=0;i<menu.size();i++) {
			leftQuantity =(menu.get(i).getQuantitiy() * menu.get(i).getPrice()) * 30 / 100; //30%만큼의 폐기 손해
			cost += leftQuantity;
		}
		return cost;
	}
	public int selectNumber() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		return n;
	}
	public String selectString() {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		return s;
	}
}
package quiz.quiz42;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodTruck implements Errorcode {
	int income = 0;
	ArrayList<Menu> menu = new ArrayList<>();
	
	public void openFoodTruck() { // 메뉴 보여주기
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
					default: errMessage(GENERAL_ERROR);
							   break;
			}
		}
	}
	public void showMenu() {
		if(menu.size() == 0) {
			errMessage(QUANTITY_ERROR);
			System.out.println("메뉴 선택으로 돌아갑니다.");
			System.out.println();
			openFoodTruck();
		} else {
			System.out.println("--------------------");
			for(int i=0;i<menu.size();i++) {
				System.out.println((i+1)+"."+menu.get(i).getName()+" : "+menu.get(i).getPrice()+"원 // 재고"
						+ menu.get(i).getQuantitiy()+"개");
			}
			System.out.println("--------------------");
		}
		System.out.println();
	}
	public void orderMenu() { // showMenu 이후 orderMenu 실행(주문)
		showMenu();
		int n,m;
		System.out.println("주문할 물건 번호");
		n = selectNumber();
		n = n-1; // index와 값의 차이 보정
		System.out.println("개수 입력");
		m = selectNumber();
		if(menu.get(n) != null) {
			if(menu.get(n).getQuantitiy()-m >= 0) {
				income += menu.get(n).getPrice()*m; // 수입이 가격*판매갯수 만큼 오른다.
				int left = menu.get(n).getQuantitiy() - m; // 기존의 quantity에서 m만큼 뺀 값이 남는값이다.
				menu.get(n).setQuantitiy(left); // 남는값을 다시 set
			}
			else {
				errMessage(QUANTITY_ERROR);
				orderMenu();
			}
		}
		else {
			errMessage(NUMBER_ERROR); // 
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
		if(result == 0) System.out.println("추가되었습니다.");
		else if(result == QUANTITY_INPUT_ERROR) {
			errMessage(QUANTITY_INPUT_ERROR);
			menuManagement();
		}
		else if(result == PRICE_ERROR) {
			errMessage(PRICE_ERROR);
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
		return; // 종료
	}
	public void errMessage(int errNum) {
		if(errNum == GENERAL_ERROR)
			System.out.println("잘못된 입력입니다. 재입력 해주세요. errorcode : -1");
		else if(errNum == QUANTITY_ERROR)
			System.out.println("재고 오류, 재입력 해주세요 errorcode : -2");
		else if(errNum == PRICE_ERROR)
			System.out.println("가격 오류. 재입력 해주세요 errorcode : -3");
		else if(errNum == NUMBER_ERROR)
			System.out.println("번호 오류. 재입력 해주세요. errorcode : -4");
		else if(errNum == QUANTITY_INPUT_ERROR)
			System.out.println("개수 오류. 재입력 해주세요. errorcode : -5");
	}
	public int addMenu(String menuName,int price,int quantity) { // 메뉴 추가
		if(price > 0) {
			if(quantity >0) {
				Menu m = new Menu(menuName,price,quantity);
				menu.add(m);
				return 0;
			}
			else return QUANTITY_INPUT_ERROR;
		} 
		else return PRICE_ERROR;
	}
	public int costPriceCalculate() { // 원가계산
		int cost = 0;
		int leftQuantity;
		for(int i=0;i<menu.size();i++) {
			leftQuantity =(menu.get(i).getQuantitiy()*menu.get(i).getPrice())*30/100; //30%만큼의 폐기 손해
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

//만들면 좋지만 못 넣은 것
//재고 삭제 (삭제된 재고는 폐기로 치는가? 에 대한 답을 알 수 없다)
//메뉴 추가시 같은 이름이면 합치기 (가격이 다른 경우를 상정하면 너무 할게 많아진다 , 가격변경도 만들어야 함)
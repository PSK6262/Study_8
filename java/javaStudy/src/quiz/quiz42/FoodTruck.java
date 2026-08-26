package quiz.quiz42;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodTruck {
	private static final Scanner SCANNER = new Scanner(System.in);
	private int income = 0;
	private ArrayList<Menu> menu = new ArrayList<>();
	
	public void openFoodTruck() { // 푸드트럭 오픈 , 외부에서 호출하기에 public
		int select = 0;
		while(select != 4) {
			System.out.println("-----포장마차 오픈-----");
			System.out.println("1. 메뉴 보기");
			System.out.println("2. 주문 하기");
			System.out.println("3. 메뉴 관리");
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
					default: ErrorCode.GENERAL_ERROR.printMessage();
						break;
			}
		}
	}
	private void showMenu() { // 메뉴 출력
		if(menu.size() == 0) {
			ErrorCode.QUANTITY_ERROR.printMessage();
			System.out.println("메뉴 선택으로 돌아갑니다.");
			System.out.println();
			return;
		} 
		else {
			System.out.println("--------------------");
			for(int i=0;i<menu.size();i++) {
				System.out.println((i+1)+"."+menu.get(i).getName()+" : "+menu.get(i).getPrice()+"원 [재고 "
						+ menu.get(i).getQuantitiy()+"개]");
			}
			System.out.println("--------------------");
		}
		System.out.println();
	}
	private void orderMenu() { // 주문받기
		if(menu.size() == 0) {
			showMenu(); // 0일때 오류메세지 있음
			return;
		}
		while(true) {
			showMenu();
			int productNumber, productQuantity;
			System.out.println("주문할 물건 번호 [ 0 입력시 주문 취소 ]");
			productNumber = selectNumber();
			if(productNumber == 0) return;
			
			productNumber = productNumber - 1; // index와 value의 차이 보정
			if(productNumber >= 0 &&  productNumber < menu.size()) {
				System.out.println("개수 입력  [ 0 입력시 주문 취소 ]");
				productQuantity = selectNumber();
				if(productQuantity == 0) return;
				
				if(menu.get(productNumber).getQuantitiy() - productQuantity >= 0) {
					income += menu.get(productNumber).getPrice() * productQuantity; // 수입 계산
					int left = menu.get(productNumber).getQuantitiy() - productQuantity; // 개수 계산
					menu.get(productNumber).setQuantitiy(left);
					break;
				}
				else 	ErrorCode.QUANTITY_ERROR.printMessage();
			}
			else 	ErrorCode.NUMBER_ERROR.printMessage();
		}
	}
	private void menuManagement() { // 메뉴추가
		while(true) {
			System.out.println("추가할 메뉴의 이름을 입력하세요.");
			String productName = selectString();
			System.out.println("추가할 메뉴의 가격을 입력하세요.");
			int productPrice = selectNumber();
			System.out.println("추가할 메뉴의 개수를 입력하세요.");
			int productQuantity = selectNumber();
			ErrorCode result = addMenu(productName, productPrice, productQuantity);
			
			if(result == ErrorCode.NO_ERROR) {
				System.out.println("추가되었습니다.");
				return;
			}
			else result.printMessage(); // 에러가 있는 경우 해당 오류 출력
			System.out.println();
		}
	}
	private void shutDownFoodTruck() { // 문닫기
		if(income != 0) {
			int cost = costPriceCalculate();
			System.out.println("마감 완료");
			System.out.println("벌어들인 금액 : "+income);
			System.out.println("폐기로 인한 손해 : "+cost);
			System.out.println("총 벌어들인 금액 : "+(income-cost));
		}
		else System.out.println("오늘은 쉽니다.");
		return;
	}
	private ErrorCode addMenu(String menuName,int price,int quantity) { // 메뉴 추가
		if(price > 0) {
			if(quantity >0) {
				Menu m = new Menu(menuName,price,quantity);
				menu.add(m);
				return ErrorCode.NO_ERROR;
			}
			else return ErrorCode.QUANTITY_INPUT_ERROR;
		} 
		else return ErrorCode.PRICE_ERROR;
	}
	private int costPriceCalculate() { // 원가계산
		int cost = 0;
		for(Menu m : menu)
			cost +=(m.getQuantitiy() * m.getPrice()) * 30 / 100; //30%만큼의 폐기 손해
		return cost;
	}
	private int selectNumber() { // 숫자 입력받기 , 예외처리 필요
		int number = SCANNER.nextInt(); 
		SCANNER.nextLine(); // 버퍼 제거
		return number;
	}
	private String selectString() { // 문자열 입력받기
		String string = SCANNER.nextLine();
		return string;
	}
}
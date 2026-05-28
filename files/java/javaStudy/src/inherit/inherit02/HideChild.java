package inherit.inherit02;

import inherit.inherit01.Parent;

public class HideChild extends Parent{
	HideChild(){
		super(0);
	}
	
	HideChild(int money){
		super(money);
	}
	
	public void showMoney() {
		System.out.println(money);
	}
}

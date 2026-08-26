package inherit.inherit01;

public class Parent extends GrandParent{
	public int money;
	
//	public Parent(){
//		System.out.println("Parent() 생성자 호출됨");
//	}
	public Parent(int money){
		this.money = money;
		System.out.println("Parent(int money) 생성자 호출됨");
	}
	void work() {
		System.out.println("열심히 일하는 중");
	}
}

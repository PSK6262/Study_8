package homework;

public class Person {
	String name;
	int age;

	Person(){
		
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void hello() {
		System.out.println(name + " : Hello!");
	}
}

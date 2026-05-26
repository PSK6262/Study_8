package quiz.quiz24;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		
		p1.name = "나이름";
		p1.gender = "남"; // "여"
		p1.age = 50;
		p1.height = 195;
		p1.weight = 105.7;
		p1.job = "건물주";
		p1.bloodType = "A";
		p1.healthState = "매우좋음";
		p1.isSleeping = false;
		
		System.out.println(p1.name);
		System.out.println(p1.gender);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(p1.weight);
		System.out.println(p1.job);
		System.out.println(p1.bloodType);
		System.out.println(p1.healthState);
		System.out.println(p1.isSleeping);
		
		
		System.out.println("--------------------");
		Person p2 = new Person("다네임", 33, 155, true);
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.height);
		System.out.println(p2.isSleeping);
		
		p2.weight = 44.4;
		
	}

}

package cls.cls_quiz01;

public class HumanMain {

	public static void main(String[] args) {
		Human h1 = new Human("박성국","남","O");
		h1.setSleep(false);
		h1.setAge(28);
		h1.setHeight(175.0);
		h1.setWeight(90.0);
		h1.setJob("없음");
		h1.setBodyStatus("문제없음");
		System.out.println(h1.getName());
		System.out.println(h1.getGender());
		System.out.println(h1.getAge());
		System.out.println(h1.getHeight());
		System.out.println(h1.getWeight());
		System.out.println(h1.getJob());
		System.out.println(h1.getAge());
		System.out.println(h1.getBloodType());
		System.out.println(h1.getBodyStatus());
		System.out.println(h1.isSleep());
	}
}

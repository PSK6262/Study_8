package quiz.quiz36;

import java.util.ArrayList;

public class SuperTest {
	public static void main(String[] args) {
//		Orc orc = new Orc("오크",80);
//		System.out.println(orc.toString());
//		OrcWarrior orcWarrior = new OrcWarrior("오크전사",120,3);
//		System.out.println(orcWarrior.toString());
		ArrayList<Orc> orcList = new ArrayList<>();
		orcList.add(new Orc("오크",80));
		orcList.add(new OrcWarrior("오크전사",120,3));
		for(int i = 0; i<orcList.size();i++) {
			System.out.println(orcList.get(i));
		}
	/* 1. Orc 객체를 만들고 정보를 출력하시오. */
	/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
		}
}
class Orc {
	protected String name;
	protected int hp;
	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
}
	public String toString() {
		return "Orc { name: "+this.name+", hp: "+this.hp+" }";
	}
}
class OrcWarrior extends Orc{
	protected int armor;
	
	public OrcWarrior(String name, int hp, int armor) {
		super(name, hp);
		this.armor = armor;
}
// 메소드 오버라이딩!
	@Override
	public String toString() {
		return "OrcWarriror { name: "+this.name+", hp: "+this.hp+", armor: "+this.armor+" }";
	}
}
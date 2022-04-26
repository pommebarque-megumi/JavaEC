package day1;

public class Monster {
	String name;
	int hp;
	int power;
	Monster(String name,int hp){
		this.name=name;
		this.hp=hp;
		this.power=power;
	}
	public void attack(Hero h) {
		System.out.printf("%sは%dのダメージを与えた！",this.name,this.power);
		h.setHp((h.getHp()-this.power));
	}

}

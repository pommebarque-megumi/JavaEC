package day1;

public class Main {

	public static void main(String[] args) {
		Wand wand1 = new Wand();
		wand1.setName("雷の精霊の杖");
		wand1.setPower(100);
		Wizard wizard1 = new Wizard();
		wizard1.setName("Clair");
		wizard1.setHp(2000);
		wizard1.setMp(3000);
		wizard1.setWand(wand1);
		Hero hero1 = new Hero();
		hero1.setName("Wolfric");
		wizard1.heal(hero1);
		System.out.println(hero1.toString());
		System.out.println(wizard1);
	}

}

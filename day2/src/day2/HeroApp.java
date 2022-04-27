package day2;

public class HeroApp {
	public static void main(String[] args) {
		Hero h1=new Hero("ジェシカ",100);
		Hero h2=new Hero("ジェシカ",200);
		Hero h3=new Hero("リンク",100);

		if(h1!=h2) {
			System.out.println("同値ではありません");
		}
		if(h1.equals(h2)) {
			System.out.println("同価です");
		}
		if(!h1.equals(h3)) {
			System.out.println("同価ではありません");
		}
	}
}

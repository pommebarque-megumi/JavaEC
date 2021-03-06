package day1;

public class Wizard {
	private String name;
	private int hp;
	private int mp;
	private Wand wand;

	public String toString() {
		return "名前："+this.name+"/HP:"+this.hp;
	}
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getMp() {
		return this.mp;
	}
	public void setName(String name) {
		if(name==null) {
			throw new IllegalArgumentException
			("名前がnullです。処理を中断。");
		}else if(name.length()<2) {
			throw new IllegalArgumentException
			("名前が短すぎます。処理を中断。");
		}else {
			this.name=name;
		}
	}
		public void setHp(int hp) {
			if(hp<0) {
				this.hp=0;
			}else{
				this.hp=hp;
			}
		}
		public void setMp(int mp) {
			if(mp<0) {
				this.mp=0;
			}else{
				this.mp=mp;
			}
		}
		public void setWand(Wand wand) {
			this.wand=wand;
		}
		public void heal(Hero h) {
			int basePoint =10;
			int recoverPoint =(int)(basePoint*this.wand.getPower());
			h.setHp(h.getHp() + recoverPoint);
			System.out.println(h.getName()+"のHPを"+recoverPoint+"回復した");
		}
}

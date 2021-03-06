package day1;

public class Wand {
	private String name;
	private double power;

	public String getName() {
		return this.name;
	}
	public double getPower() {
		return this.power;
	}

	public void setName(String name) {
		if(name==null) {
			throw new IllegalArgumentException
			("名前がnullです。処理を中断。");
		}else if(name.length()<2) {
			throw new IllegalArgumentException
			("名前が短すぎです。処理を中断。");
		}else {
			this.name=name;
		}
	}
	public void setPower(double power) {
		if((power<0.5)||(power>100.0)) {
			throw new IllegalArgumentException
			("杖に設定しようとしている魔力が異常です");
		}
			this.power=power;
	}
}

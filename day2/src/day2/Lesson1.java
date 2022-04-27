package day2;

public class Lesson1 {

	public static void main(String[] args) {
		Method(3,5,7,9);
		int sum = sumOf(3,5,7,9);
		System.out.println(sum);
	}
	public static void Method(int...args) {//可変長引数【０個以上の引数で実行】
		for(int i : args) {
			System.out.println(i);
		}
	}
	public static  int sumOf(int n ,int...nums) {
		int sum=n;
		for(int i : nums) {
			sum+=i;
		}
		return sum;
	}

}

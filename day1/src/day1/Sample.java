package day1;

import java.util.HashMap;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {
		System.out.println("Hallo");
		System.out.println("こんにちは！");

		Map<String,String> map = new HashMap<>();
		map.put("東京","都");
		map.put("神奈川","県");
		map.put("大阪","府");
		System.out.println(map);
	}
}

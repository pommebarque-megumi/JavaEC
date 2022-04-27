package day2;

public class RegExplession {

	public static void main(String[] args) {
		String s="Java";
		if(s.matches("Java")) {
			System.out.println("Match!");
		}
		if(s.matches("J.va")) {
			System.out.println("Match!");
		}
		if("Jaaaaaaaava".matches("Ja*va")) {
			System.out.println("Match!");
		}
		s="abc,def:ghi";
		String[]words=s.split("[,:]");
		for(String w : words) {
			System.out.println(w+"->");
		}
		String w=s.replaceAll("[bec]","X");
		System.out.println(w);
	}

}

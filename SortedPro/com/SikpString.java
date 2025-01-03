package SortedPro.com;

public class SikpString {
	public static void main(String[] args) {
		String s="bcsappleghyikjk";
		System.out.println(skipApple(s));
	}

	static String skipApple(String s) {
		if(s.isEmpty()) {
			return "";
		}
		if(s.startsWith("apple")) {
			return skipApple(s.substring(5));
		}else {
		return s.charAt(0)+skipApple(s.substring(1));
		}
	}

}

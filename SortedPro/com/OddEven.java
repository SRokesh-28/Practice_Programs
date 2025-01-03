package SortedPro.com;

public class OddEven {
	public static void main(String[] args) {
		int n=0;
		System.out.println(sum(n));
	}

 static String sum(int n) {
	if(n==0) {
		return "Zero";
	}
 else if((n&1)==1) {
			return "Odd";
		}
		return "Even";
	}

}

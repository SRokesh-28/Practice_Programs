package SortedPro.com;

public class RecursivePrintNum {

	public static void main(String[] args) {
		int ans=facto(5);
System.out.println(ans);
	}
	static void fun(int n) {
		if(n==0) {
			return;
		}
		
		fun(n-1);
		System.out.println(n);
	}
	static int facto(int n) {
		if(n==1) {
			return 1;
		}
		return n*facto(n-1);
	}

}

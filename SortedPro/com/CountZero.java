package SortedPro.com;

public class CountZero {

	public static void main(String[] args) {
		int n=102030;
		System.out.println(countzero(n));

	}
	static int countzero(int n) {
		return helper(n,0);
	}
	static int helper(int n, int count) {
		if(n==0) {
			return count;
		}
		int rem=n%10;
		if(rem==0) {
			return helper(n/10,count+1);
		}
		return helper(n/10,count);
	}

}

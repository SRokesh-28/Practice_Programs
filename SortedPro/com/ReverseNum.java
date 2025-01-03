package SortedPro.com;

public class ReverseNum {

	public static void main(String[] args) {
		rever(1482);
		System.out.println(sum);

	}
	static int sum=0;
	static void rever(int n) {
		if(n==0) {
			return;
		}
		int rem=n%10;
		sum=sum*10+rem;
		rever(n/10);
	}

}

package SortedPro.com;

import java.util.Arrays;

public class PlusOne {
	public static void main(String[] args) {
		int digits[]= {9,8,7,6,5,4,3,2,1,0};
		System.out.println(Arrays.toString(plusOne(digits)));
	}

	static long[] plusOne(int[] digits) {
		int size=0;
		long num=0;
		for(int i=0;i<digits.length;i++) {
			num=num*10+digits[i];
		}
		num+=1;
		 int digitCount = (int) Math.log10(num) + 1;
		if(digitCount!=digits.length) {
			size=digits.length+1;
		}
		else {
			size=digits.length;
		}
		long[] ans=new long[size];
		for(int i=ans.length-1;i>=0;i--) {
			ans[i]=(num%10);
			num/=10;
		}
		return ans;
	}

}

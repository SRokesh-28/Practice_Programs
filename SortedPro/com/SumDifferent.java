package SortedPro.com;

import java.util.Arrays;

public class SumDifferent {
	public static void main(String[] args) {
		int[] nums= {1};
		System.out.println(Arrays.toString(sumDifferent(nums)));
	}

	static int[] sumDifferent(int[] nums) {
		int[] ans=new int[nums.length];
		int sum=0;
		int[] left=new int[nums.length];
		int[] right=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			left[i]=sum;
			sum+=nums[i];
		}
		sum=0;
		for(int i=nums.length-1;i>=0;i--) {
			right[i]=sum;
			sum+=nums[i];
		}
		for(int i=0;i<nums.length;i++) {
			ans[i]=Math.abs(left[i]-right[i]);
		}
		return ans;
	}

}

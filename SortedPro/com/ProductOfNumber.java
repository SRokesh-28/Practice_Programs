package SortedPro.com;

import java.util.Arrays;

public class ProductOfNumber {
	public static void main(String[] args) {
		int[] nums= {-10, -10, 5, 2};
		System.out.println(maxi(nums));
	}

	static int maxi(int[] nums) {
		nums = Arrays.stream(nums).map(Math::abs).toArray();
		Arrays.sort(nums);
		return helper(nums,nums.length-1,1);
	}

	 static int helper(int[] nums, int i, int mult) {
		if(i==nums.length-4) {
			return mult;
		}
		return helper(nums,i-1,mult*=nums[i]);
	}

}

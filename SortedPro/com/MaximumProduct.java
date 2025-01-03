package SortedPro.com;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumProduct {
	public static void main(String[] args) {
		int[] nums= {3,7};
		System.out.println(maximumProdu(nums));
	}

	static int maximumProdu(int[] nums) {
		Arrays.sort(nums);
		int ans=(nums[nums.length-1]-1)*(nums[nums.length-2]-1);
		return ans;
		
	}

}

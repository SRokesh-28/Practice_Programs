package SortedPro.com;

import java.util.Arrays;

public class MissNum {
	public static void main(String[] args) {
		int[] nums= {9,6,4,2,3,5,7,0,1};
		System.out.println(missNum(nums));
	}

 static int missNum(int[] nums) {
		Arrays.sort(nums);
		return helper(nums,0);
	}

static int helper(int[] nums, int i) {
	if(i==nums.length) {
		return i;
	}
	if(i!=nums[i]) {
		return i;
	}
	return helper(nums,i+1);
}

}

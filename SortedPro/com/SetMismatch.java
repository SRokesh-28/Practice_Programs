package SortedPro.com;

import java.util.Arrays;

public class SetMismatch {
	public static void main(String[] args) {
		int[] nums= {3,2,2};
		System.out.println(Arrays.toString(misMatch(nums)));
	}

	static int[] misMatch(int[] nums) {
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=i+1) {
				return new int[] {nums[i],i+1};
			}
		}
		return new int[] {-1};
	}

}

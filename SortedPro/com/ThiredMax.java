package SortedPro.com;

import java.util.Arrays;

public class ThiredMax {
	public static void main(String[] args) {
		int[] nums= {2,2,3,1};
		System.out.println(thiredMaxx(nums));
	}

	static int thiredMaxx(int[] nums) {
		Arrays.sort(nums);
		int max;
		if(nums.length==1||nums.length==2) {
			max=nums[0];
		}else {
		max=nums[nums.length-3];
		}
		return max;
	}

}

package SortedPro.com;

import java.util.Arrays;

public class SquaresOfSort {

	public static void main(String[] args) {
		int[] nums= {-4,-1,0,3,10};
	System.out.println(Arrays.toString(	squareofSort1(nums)));
//		Arrays.sort(nums);
//		System.out.println(Arrays.toString(nums));
	}
//	static int[] squareofSort(int[] nums) {
//		return helper(nums,0);	
//	}
//	static int[] helper(int[] nums, int i) {
//		if(i==nums.length) {
//			return nums;
//		}
//		
//		return helper(nums,i+1);
//	}

	static int[] squareofSort1(int[] nums) {
		//int[] ans=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			nums[i]=(int)Math.pow(nums[i], 2);
		}
		Arrays.sort(nums);
		return nums;
	}
	
}

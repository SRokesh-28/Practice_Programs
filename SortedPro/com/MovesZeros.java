package SortedPro.com;

import java.util.Arrays;

public class MovesZeros {
	public static void main(String[] args) {
		int[] nums= {0,1,0,3,12};
		moveZeros(nums);
	}

	static void moveZeros(int[] nums) {
		Arrays.sort(nums);
		int[] ans=new int[nums.length];
		int j=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				ans[j]=nums[i];	
				j++;
			}
		}
		System.out.println(Arrays.toString(ans));
	}

}

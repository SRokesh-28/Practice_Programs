package SortedPro.com;

import java.util.Arrays;

public class SmallNumCurrenNum {
	public static void main(String[] args) {
		int[] nums= {7,7,7,7};
		System.out.println(Arrays.toString(smallSum(nums)));
	}

	static int[] smallSum(int[] nums) {
		int[] ans=new int[nums.length];
		int i=0;
		int count=0;
		while(i<nums.length) {
			for(int j=0;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					count+=1;
				}
			}
			ans[i]=count;
			count=0;
			i++;
		}
		return ans;
	}

}

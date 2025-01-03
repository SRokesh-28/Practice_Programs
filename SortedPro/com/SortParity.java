package SortedPro.com;

import java.util.Arrays;

public class SortParity {

	public static void main(String[] args) {
		int[] nums= {3,1,2,4};
		System.out.println(Arrays.toString(sortParty(nums)));
	}

	static int[] sortParty(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0+i;j<nums.length;j++) {
				if(nums[j]%2==0) {
					int temp=nums[j];
					nums[j]=nums[i];
					nums[i]=temp;
				}
			}
			
		}
		return nums;
	}

}

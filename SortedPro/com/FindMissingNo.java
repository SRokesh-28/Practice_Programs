package SortedPro.com;

import java.util.Arrays;

public class FindMissingNo {

	public static void main(String[] args) {
		int[] nums= {3,0,1};
	findMissingno(nums);

	}
	static int findMissingno(int[] nums) {
		int i=0;
		int n=nums.length;
		while(i<nums.length) {
			if(nums[i]<nums.length && nums[i]!=nums[nums[i]]) {
				int temp=nums[i];
				nums[i]=nums[nums[i]];
				nums[nums[i]]=temp;
				
			}
			else {
				i++;
			}
		}
		for(int index=0;index<nums.length;index++) {
			if(nums[index]!=index) {
				return index;
			}
		}
		//System.out.println(Arrays.toString(nums));
	return n;
	}

}

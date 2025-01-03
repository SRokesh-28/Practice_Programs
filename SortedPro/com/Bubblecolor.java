package SortedPro.com;

import java.util.Arrays;

public class Bubblecolor {

	public static void main(String[] args) {
		int[] nums= {2,0,1};
       System.out.println( Arrays.toString(sortColor(nums)));
        
       
	}
	static int[] sortColor(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=1;j<nums.length-i;j++) {
				if(nums[j]<nums[j-1]) {
					int temp=nums[j];
					nums[j]=nums[j-1];
					nums[j-1]=temp;
				}
			}
		}
		return nums;
	}

}

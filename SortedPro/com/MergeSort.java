package SortedPro.com;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] nums= {5,2,1,4,3};
		System.out.println(Arrays.toString(sort(nums)));
	}
	static int[] sort(int[] nums) {
		if(nums.length==1) {
			return nums;
		}
		int mid=nums.length/2;
		int[] left=sort(Arrays.copyOfRange(nums, 0, mid));
		int[] right=sort(Arrays.copyOfRange(nums, mid, nums.length));
		return merge(left,right);
	}
	static int[] merge(int[] left, int[] right) {
		int[] ans=new int[left.length+right.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length&&j<right.length) {
			if(left[i]<right[j]) {
				ans[k]=left[i];
				i++;
			}
			else {
				ans[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left.length) {
			ans[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length) {
			ans[k]=right[j];
			j++;
			k++;
		}
		
		
		return ans;
	}

}

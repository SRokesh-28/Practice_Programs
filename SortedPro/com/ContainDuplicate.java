package SortedPro.com;

import java.util.Arrays;

public class ContainDuplicate {
public static void main(String[] args) {
	int[] nums= {1,1,1,3,3,4,3,2,4,2};
System.out.println(containDuplic(nums));
}

//static boolean containDupli(int[] nums) {
//	boolean ans=false;
//	int end=nums.length-1;
//	for(int i=0;i<nums.length-1;i++) {
//		for(int j=i+1;j<nums.length;j++) {
//			if(nums[i]==nums[j]) {
//				ans=true;
//				break;
//			}
//		}
//	}
//	return ans;
//}
static boolean containDuplic(int[] nums) {
	Arrays.sort(nums);
	for(int i=0;i<nums.length;i++) {
		if(nums[i]==nums[i+1]) {
			return true;
		}
	}
	return false;
	
}
}

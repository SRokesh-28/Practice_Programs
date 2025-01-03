package SortedPro.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DisapperNumber {
	public static void main(String[] args) {
		int[] nums= {1,1};
		System.out.println(disappearNum(nums));
	}

	static List<Integer> disappearNum(int[] nums) {
		Arrays.sort(nums);
		List<Integer> list=new ArrayList<>();
		List<Integer> list1=new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
				list.add(nums[i]);
			}
		for(int i=1;i<=list.size();i++) {
			if(list.indexOf(i)==-1) {
				list1.add(i);
			}
		}
		
//		for(int i=0;i<nums.length;i++) {
//			if(i==nums.length-1) {
//				list.add(nums[i]);
//			}
//			else if(nums[i]<nums[i+1]) {
//				list.add(nums[i]);
//			}
//		}
//		for(int i=1;i<=list.size();i++) {
//	if(list.indexOf(i)==-1) {
//		list1.add(i);
//	}
//	}
//	
//		
	return list1;
	}

}

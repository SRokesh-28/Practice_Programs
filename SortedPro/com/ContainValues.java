package SortedPro.com;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainValues {
	public static void main(String[] args) {
		int[] nums1= {1,2,2,1};
		int[] nums2= {2,2};
System.out.println(Arrays.toString(containOrNot(nums1,nums2)));
	}
static int[] containOrNot(int[] nums1, int[] nums2) {
		int[] ans=new int[nums2.length];
		int i=0;
		while(i<nums1.length) {
			for(int j=0;j<nums2.length;j++)
			{
				if(nums1[i]==nums2[j]) {
					ans[i]=nums1[i];
				}
			}
			i++;
		}
	
		
		return ans;
	}

}

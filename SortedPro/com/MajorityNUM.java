package SortedPro.com;

import java.util.Arrays;

public class MajorityNUM {
	public static void main(String[] args) {
		int[] nums= {1};
		System.out.println(majorityNum(nums));
	}

	 static int majorityNum(int[] nums) {
		 Arrays.sort(nums);
		 int ans=0;
		int i=0;
		int j=1;
		int count=0;
		if(nums.length==1) {
			ans=nums[0];
		}
		while(j<nums.length) {
			if(nums[i]==nums[j]) {
				count+=1;
				if(count>=nums.length/2) {
					ans=nums[i];
					break;
				}
			}
			i++;
			j++;
		}
		return ans;
	}

}

package SortedPro.com;

import java.util.HashMap;

public class ContainDupli {
	public static void main(String[] args) {
		int[] nums= {1,0,1,1};
		int k=1;
		//System.out.println(containDupli(nums,k));
		System.out.println(containsNearbyDuplicate(nums,k));
	}
//static boolean containDupli(int[] nums,int k) {
//		boolean ans=false;
//		int i=0;
//		while(i<nums.length) {
//			for(int j=i+1;j<nums.length;j++) {
//				if(nums[i]==nums[j]) {
//					int sum=Math.abs(i-j);
//					if(k>=sum) {
//						ans=true;
//						break;
//					}
//					else {
//						i++;
//					}	
//				}
//			}
//			i++;
//		}
//		return ans;
//}
	 static boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if( (nums[i] == nums[j]) && (Math.abs(i-j) <= k) ) return true;
            }
        }
        return false;
    }

}

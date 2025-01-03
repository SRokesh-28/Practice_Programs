package SortedPro.com;

public class Goodpair {
	public static void main(String[] args) {
		int[] nums1= {1,2,4,12};
		int[] nums2= {2,4};
		int k=3;
		System.out.println(goodPair(nums1,nums2,k));
	}

	static int goodPair(int[] nums1, int[] nums2, int k) {
		int count=0;
		int i=0;
		while(i<nums1.length) {
			for(int j=0;j<nums2.length;j++) {
				if(nums1[i]%(nums2[j]*k)==0) {
					count+=1;
				}
			}
			i++;
		}
		return count;
	}

}

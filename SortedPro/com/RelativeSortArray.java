package SortedPro.com;

import java.util.Arrays;

public class RelativeSortArray {
	public static void main(String[] args) {
		int[] arr1= {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2= {2,1,4,3,9,6};
	System.out.println(Arrays.toString(relativesort( arr1,arr2)));	
	}

	static int[] relativesort(int[] arr1, int[] arr2) {
		int[] ans=new int[arr1.length];
		int k=0;
		int i=0;
		while(i<arr2.length) {
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i]==arr2[j]) {
					ans[k]=arr2[j];
					k++;
				}
			}
			i++;
		}
		return ans;
	}

}

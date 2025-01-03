package SortedPro.com;

import java.util.ArrayList;
import java.util.List;

public class SunOfSubset {
	public static void main(String[] args) {
		int[] nums= {3,4,5,6,7,8};
		System.out.println(sumOf(nums));
	}

static int sumOf(int[] nums) {
		List<List<Integer>> list=new ArrayList<>();
		int sum=0;
		int res=0;
		list.add(new ArrayList());
		for(int arr:nums) {
			int n=list.size();
			for(int i=0;i<n;i++) {
				List<Integer> ans=new ArrayList<Integer>(list.get(i));
				ans.add(arr);
				list.add(ans);
			}
		}
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.get(i).size();j++) {
				sum^=list.get(i).get(j);
			}
			res+=sum;
			sum=0;
		}
	
		return res;
	}

}

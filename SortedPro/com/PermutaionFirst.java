package SortedPro.com;

import java.util.ArrayList;
import java.util.List;
public class PermutaionFirst {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		firstPermutation(arr);
	}
	static void firstPermutation(int[] arr) {
		List<List<Integer>> list=new ArrayList<>();
		list.add(new ArrayList());
		for(int num:arr) {
			int n=list.size();
			for(int i=0;i<n;i++) {
				List<Integer> ans=new ArrayList<>(list.get(i));
				ans.add(num);
				list.add(ans);
			}
		}
		System.out.println(list);
	}

}

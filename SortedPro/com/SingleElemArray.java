package SortedPro.com;

public class SingleElemArray {
	public static void main(String[] args) {
		int[] arr= {2,4,2,6,3,4,3};
		System.out.println(singleVal(arr));
	}

	static int singleVal(int[] arr) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans=ans^arr[i];
		}
		return ans;
	}

}

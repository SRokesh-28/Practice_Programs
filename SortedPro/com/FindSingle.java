package SortedPro.com;

public class FindSingle {
	public static void main(String[] args) {
		int[] arr= {-2,3,2,4,-5,5,-4,8,-3};
		System.out.println(single(arr));
	}

	static int single(int[] arr) {
		int ans=0;
		for(int num:arr) {
			ans+=num;
		}
		return ans;
	}

}

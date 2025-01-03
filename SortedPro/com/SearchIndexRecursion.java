package SortedPro.com;

public class SearchIndexRecursion {
	public static void main(String[] args) {
		int[] arr= {1,12,3,18,9};
		int target=9;
		System.out.println(search(arr,0,target));
	}
	static int search(int[] arr,int index,int target) {
		if(target==arr[index]) {
			return index;
		}
		return helper(arr,index,target);
	}
	static int helper(int[] arr, int index, int target) {
		if(arr.length-1==index) {
			return -1;
		}
		return search(arr,index+1,target);
	}

}

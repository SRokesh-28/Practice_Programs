package SortedPro.com;

public class Divied3 {
	public static void main(String[] args) {
		int[] nums= {3,6,9};
		System.out.println(divied3(nums));
	}
	static int divied3(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if((nums[i]%3)!=0) {
				count+=1;
			}
		}
		return count;
	}

}

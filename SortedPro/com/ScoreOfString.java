package SortedPro.com;

public class ScoreOfString {
	public static void main(String[] args) {
		String s="zaz";
		
		System.out.println(strScore(s));
	}

	static int strScore(String s) {
		int score=0;
		int[] nums=new int[s.length()];
		for(int i=0;i<nums.length;i++) {
			nums[i]=s.charAt(i)+0;
		}
		for(int i=0;i<nums.length-1;i++) {
			score+=Math.abs(nums[i]-nums[i+1]);
		}
		return score;
	}

}

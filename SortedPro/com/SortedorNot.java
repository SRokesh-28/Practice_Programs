package SortedPro.com;

public class SortedorNot {
	public static void main(String[] args) {
		int[] arr= {1,2,4,8,41,24};
		System.out.println(sorted(arr,0));
	}
	static boolean sorted(int[] arr,int index) {
		if(index==arr.length-1) {
			return true;
		}
		return arr[index]<arr[index+1]&&sorted(arr,index+1);
	}

}

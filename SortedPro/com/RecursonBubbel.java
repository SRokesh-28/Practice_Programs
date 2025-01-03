package SortedPro.com;

import java.util.Arrays;

public class RecursonBubbel {

	public static void main(String[] args) {
		int[] arr= {4,2,1,3,5};
        bubbel(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
	}
	static void bubbel(int[] arr,int i,int j) {
		if(i==arr.length) {
			return;
		}
		if(j<arr.length-1) {
		if(arr[j]>arr[j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
		bubbel(arr,i,j+1);
	}else {
		bubbel(arr,i+1,0);
	}

}
}

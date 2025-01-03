package SortedPro.com;
import java.util.Arrays;
public class Selectionsort {
	public static void main(String[] args) {
		int[] arr= {97,88,68,56,17};
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void selection(int[] arr) {
		for(int i=0;i<arr.length;i++) {
		int last=arr.length-i-1;
		int max=getmax(arr,0,last);
		swap(arr,max,last);
		}
	}
static int getmax(int[] arr, int start, int end) {
		int maxx=start;
		for(int i=start;i<=end;i++) {
			if(arr[maxx]<arr[i]) {
				maxx=i;
			}
		}
		return maxx;
	}
static void swap(int[] arr, int max, int last) {
		int temp=arr[max];
		arr[max]=arr[last];
		arr[last]=temp;	
	}
}

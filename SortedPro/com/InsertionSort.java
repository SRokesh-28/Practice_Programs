package SortedPro.com;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {4,10,2,7,3,8,1,5};
		insertion(arr);

	}
	static void insertion(int[] arr) {
		for(int i=0;i<arr.length-1;i++)//why i<arr.length-1, because j value is always i+1 
		{
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
				else {
					break;
				}
			}
		}
	System.out.println(	Arrays.toString(arr));
	}
	static void swap(int[] arr, int first, int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
		
		
	}

}

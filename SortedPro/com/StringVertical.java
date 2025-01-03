package SortedPro.com;

import java.util.ArrayList;
import java.util.Arrays;

public class StringVertical {
	public static void main(String[] args) {
		String s1="Eating right now";
		String s2="Eating";
		System.out.println(strVertical(s1,s2));
	}

	static boolean strVertical(String s1,String s2) {
		boolean ans=false;
		String[] arr1=s1.split(" ");
		String[] arr2=s2.split(" ");
		if(arr1.length==1) {
			ans=false;
		}
		else {
		int i=0;
		while(i<arr1.length) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i].equals(arr2[j])) {
					ans=true;
				}
			}
			i++;
		}
		}
		return ans;

	}

}

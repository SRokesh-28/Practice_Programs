package SortedPro.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextGreaterEle {
	public static void main(String[] args) {
		int n=21;
		String str=Integer.toString(n);
		permutation(str,"");
	}
	static void permutation(String str,String emty) {
		if(str.isEmpty()) {
			System.out.println(emty);
			return;
		}
		char ch=str.charAt(0);
		for(int i=0;i<=emty.length();i++) {
			String f=emty.substring(0,i);
			String s=emty.substring(i,emty.length());
			permutation(str.substring(1),f+ch+s);
		}
	}
}
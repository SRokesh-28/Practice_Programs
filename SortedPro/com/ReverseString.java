package SortedPro.com;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String[] s= {"h","e","l","l","o"};
       // rever(s,s.length-1);
        rever1(s);
	}
static void rever(String[] s,int len) {
	if(len==0) {
		System.out.println(s[0]);
		return;
	}
	System.out.print(s[len]);
	rever(s,--len);
}
//use Binary Search
static void rever1(String[] s) {
	int start=0;
	int end=s.length-1;
	while(start<end) {
		String temp=s[start];
		s[start]=s[end];
		s[end]=temp;
		start++;
		end--;
	}
	System.out.println(Arrays.toString(s));
	
}
}

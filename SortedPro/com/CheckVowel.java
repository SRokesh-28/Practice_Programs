package SortedPro.com;

import java.util.Arrays;
import java.util.HashSet;

public class CheckVowel {
	public static void main(String[] args) {
		String s="textbook";
	System.out.println(checkVowel(s));
	}

	static boolean checkVowel(String s) {
		boolean ans=false;
		boolean ans2=false;
		char[] vow= {'a','e','i','o','u','A','E','I','O','U'};
		HashSet<Character> sb1=new HashSet<Character>();
		HashSet<Character> sb2=new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			if(i>=s.length()/2) {
				sb2.add(s.charAt(i));
			}
			else {
			sb1.add(s.charAt(i));
			}
	}
		System.out.println(sb1);
		System.out.println(sb2);
		for (int i = 0; i < vow.length; i++) {
		    if (sb1.contains(vow[i]) && sb2.contains(vow[i])) {
		        ans = true;
		        break;
		    }
		}
		return ans;
	}
}

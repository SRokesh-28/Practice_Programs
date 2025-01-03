package SortedPro.com;

import java.util.Arrays;

public class SplitPalindrom {
	public static void main(String[] args) {
		String a="x";
		String b="y";
	System.out.println(palin(a,b));
	}

	static boolean palin(String a, String b) {
		boolean ans=false;
		if(a.length()==1&&b.length()==1) {
			ans=true;
		}
		StringBuilder buil1=new StringBuilder();
		StringBuilder buil2=new StringBuilder();
		buil1.append(a);
		buil2.append(b);
		StringBuilder builder1=new StringBuilder();
		StringBuilder builder2=new StringBuilder();
		builder1.append(a);
		builder2.append(b);
		builder1.reverse();
		builder2.reverse();
		boolean ans1=(buil1.toString().equals(builder1.toString()));
		boolean ans2=(buil1.toString().equals(builder1.toString()));
		ans=ans1&&ans2;
		return ans;
	}

}

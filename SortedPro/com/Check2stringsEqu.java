package SortedPro.com;

public class Check2stringsEqu {
	public static void main(String[] args) {
		String word1[]= {"abc", "d", "defg"};
		String word2[]= {"abcddefg"};
	System.out.println(checkEqu(word1,word2));
	}

	 static boolean checkEqu(String[] word1, String[] word2) {
//		String ans1="";
//		String ans2="";
//		for(int i=0;i<word1.length;i++) {
//			ans1+=word1[i];
//		}
//		for(int j=0;j<word2.length;j++) {
//			ans2+=word2[j];
//			}
//		boolean res=ans1.equals(ans2);
//		return res;
		 StringBuffer str1 = new StringBuffer("");
			for(String str : word1) str1.append(str);

			StringBuffer str2 = new StringBuffer("");
			for(String str : word2) str2.append(str);

			return str1.toString().equals(str2.toString());
	}

}

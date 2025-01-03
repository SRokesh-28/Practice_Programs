package SortedPro.com;

public class PrefixStr {
	public static void main(String[] args) {
		String word="xyxzxe";
		char ch='z';
	System.out.println(	prefixRever(word,ch));
	}

	static String prefixRever(String word, char ch) {
		int sum=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==ch) {
				sum=i;
				break;
			}
		}
		int start=0;int end=sum;
		char[] wordarr=word.toCharArray();
		while(start<end) {
			char temp=wordarr[start];
			wordarr[start]=wordarr[end];
			wordarr[end]=temp;
			start++;
			end--;
		}
		String res=new String(wordarr);
		return res;
	}

}

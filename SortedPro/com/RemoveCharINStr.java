package SortedPro.com;

public class RemoveCharINStr {
	public static void main(String[] args) {
		String str="baccab";
		removeChar(str,"");
	}

	static void removeChar(String str, String ans) {
		if(str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		char ch=str.charAt(0);
		if(ch=='a') {
		removeChar(str.substring(1),ans);	
		}
		else {
			removeChar(str.substring(1),ans+ch);
		}
		
	}

}

package SortedPro.com;

public class VaildParathese {
	public static void main(String[] args) {
		String s="((";
		System.out.println(vaildParan(s));
	}

	static boolean vaildParan(String s) {
		if(s.length()==1) {
			return false;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				if(s.charAt(i+1)==')') {
					return true;
					
				}
			}
			else if(s.charAt(i)=='{') {
				if(s.charAt(i+1)=='}') {
					return true;
					
				}
			}
			else if(s.charAt(i)=='[') {
				if(s.charAt(i+1)==']') {
					return true;
					
				}
			}
		}
		return false;
	}

}

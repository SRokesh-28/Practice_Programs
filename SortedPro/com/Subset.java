package SortedPro.com;

public class Subset {
	public static void main(String[] args) {
		String str="abc";
		subset("",str);
	}

	static void subset(String emty, String str) {
		if(str.isEmpty()) {
			System.out.println(emty);
			return;
		}
		char ch=str.charAt(0);
	    subset(emty+ch,str.substring(1));
	    subset(emty,str.substring(1));
	    
		
	}

}

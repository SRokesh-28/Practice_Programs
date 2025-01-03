package SortedPro.com;

public class StringOperation {
	public static void main(String[] args) {
		String operations[]= {"++X","++X","X++"};
		System.out.println(stringoperaion(operations));
	}

	static int stringoperaion(String[] operations) {
		int count=0;
		int x=0;
		for(int i=0;i<operations.length;i++) {
			if(operations[i].equals("--X")) {
				x=-1;
			}
			else if(operations[i].equals("X--")) {
				x=-1;
			}
			else if(operations[i].equals("X++")) {
				x=1;
			}
			else {
				x=1;
			}
			count+=x;
		}
		return count;
	}

}

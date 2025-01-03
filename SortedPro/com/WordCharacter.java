package SortedPro.com;

import java.util.ArrayList;
import java.util.List;

public class WordCharacter {
	public static void main(String[] args) {
		String[] word= {"nhd","zheyegi","ogz","fpybmcc","ntbbwtde"};
		char x='g';
		System.out.println(containChar(word,x));
	}

	static List<Integer> containChar(String[] word, char x) {
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<word.length;i++) {
			for(int j=0;j<word[i].length();j++) {
				if(word[i].charAt(j)==x) {
					list.add(i);
					if(i==word.length-1) {
						break;
					}
					if(i!=word.length-1) {
						i++;
					}
				}
			}
		}
		return list;
	}
	

}

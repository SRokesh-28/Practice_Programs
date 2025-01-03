package SortedPro.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxNoOfWords {
	public static void main(String[] args) {
		int[]  heights = {1,1,4,2,1,3};
		int[] nums=Arrays.copyOf(heights, heights.length);
		System.out.println(Arrays.toString(nums));
		String[] sentence= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
//		System.out.println(maxLenWord(sentence));
	}

static int maxLenWord(String[] sentence) {
	int count=0;
	int max=Integer.MIN_VALUE;
	int j=0;
	for(int i=0;j<sentence.length&&i<sentence[j].length();i++) {
		if(sentence[j].charAt(i)==' ') {
			count++;
		}
		else if(sentence[j].charAt(i)==',') {
			if(max<count) {
				max=count;
			}
			count=0;
			j++;
		}
	}
	if(max<count) {
		max=count;
	}
	return count;
	}

}

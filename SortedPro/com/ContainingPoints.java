package SortedPro.com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ContainingPoints {
	public static void main(String[] args) {
		int[][] points= {{8,7},{9,9},{7,4},{9,7}};
		List<Integer> list=new ArrayList<>();
		int max=0;
		int sum=0;
		int[] x=new int[points.length];
		for(int i=0;i<points.length;i++) {
			for(int j=0;j<=0;j++) {
				x[i]=points[i][j];
			}
		}
	  Arrays.sort(x);
	  System.out.println(Arrays.toString(x));
	  for(int j=1;j<x.length;j++) {
		sum=x[j]-x[j-1];
		list.add(sum);
	  }
	  max=Collections.max(list);
	  System.out.println(max);
	}
}

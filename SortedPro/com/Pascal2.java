package SortedPro.com;

import java.util.ArrayList;
import java.util.List;

public class Pascal2 {
	public static void main(String[] args) {
		int numRows=1;
		System.out.println(generate(numRows));
	}
	static List<Integer> generate(int numRows) {
		numRows+=1;
	    List<List<Integer>> result=new ArrayList<>();
	    for(int row=1;row<=numRows;row++) {
	     result.add(generateRow(row));
	    }
	    List<Integer> output=new ArrayList<>();
	    for(int i=result.size()-1;i>=0;i--) {
	    	output.addAll(result.get(i));
	    	break;
	    }
	    return output;
	 }
	 static List<Integer> generateRow(int row){
		    int ans=1;
		     List<Integer> ansRow = new ArrayList<>();
		     ansRow.add(ans);
		     for(int col=1;col<row;col++){
		         ans=(ans*(row-col))/col;
		         ansRow.add(ans);
		     }
		     return ansRow;
		 }

}

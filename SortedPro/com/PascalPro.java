package SortedPro.com;

import java.util.ArrayList;
import java.util.List;

public class PascalPro {
public static void main(String[] args) {
	int numRows=6;
	System.out.println(generate(numRows));
}
static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result=new ArrayList<>();
    for(int row=1;row<=numRows;row++) {
     result.add(generateRow(row));
    }
    return result;
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

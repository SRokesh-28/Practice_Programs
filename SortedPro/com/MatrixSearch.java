package SortedPro.com;
import java.util.*;
public class MatrixSearch {
	public static void main(String[] args) {
		int[][] matrix= {
				{1,3,5,7},{10,11,16,20},{23,30,34,60}
		};
		int target=3;
		System.out.println(searchMatrix(matrix,target));
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
        boolean ans=false;
        for(int i=0;i<matrix.length;i++){
            if((matrix[i][0]<=target)&&(matrix[i][matrix[0].length-1]>=target)){
                 ans=search(matrix,i,target);
            }
        }
        return ans;
    }
    public static boolean search(int[][] matrix,int ind,int target){
        int s=0;
        int e=matrix[0].length-1;
        while(s<=e){
            int m=(e-s)/2;
            if(matrix[ind][m]==target){
                return true;
            }
            else if(matrix[ind][m]>target){
                    e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return false;
    }
}

package SortedPro.com;

import java.util.Arrays;

public class AverageSalary {
	public static void main(String[] args) {
		int[] salary= {4000,3000,1000,2000};
		System.out.println(average(salary));
	}

	 static double average(int[] salary) {
		 Arrays.sort(salary);
	       double ans=0;
	       int i=1;
	       for(i=1;i<salary.length-1;i++){
	         ans+=salary[i]; 
	       }
	       return ans/(i-1);
	}

}

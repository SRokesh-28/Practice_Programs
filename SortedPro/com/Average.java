package SortedPro.com;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		int n = 0;
		grade(n);
	}
	static void grade(int n) {
		System.out.println("Enter the Subject");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int sum=0;
		int avg;
		for(int i=1;i<=n;i++) {
			sum+=s.nextInt();
		}
		avg=sum/n;
		System.out.println("Avg : "+avg);
		System.out.print("Grade For You Exam Result : ");
		if(avg>80&&avg<=100) {
			System.out.print("A");
		}
		else if(avg>55&&avg<=80) {
			System.out.print("B");
		}
		else if(avg>40&&avg<=55) {
			System.out.print("C");
		}
		else {
			System.out.println("Fail");
		}
	}

}

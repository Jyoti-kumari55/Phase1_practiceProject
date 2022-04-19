package employee.com.mph.basics;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinValue {
	public static void main(String[] args) {
		int size;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		//System.out.println("");
	  size = sc.nextInt();
	  int a[]=new int[size];
	  for(int i=0;i<a.length;i++) {
		  System.out.println("Enter the value of aaray at location" +i);
		  a[i]=sc.nextInt();
	  }
	  Arrays.sort(a);
	  System.out.println("Enter the the min and max values");
	  int n = sc.nextInt();
	  
	  System.out.println(" the nth max value is " + a[n-1] + " and nth min value " + a[size-n]);
}
}

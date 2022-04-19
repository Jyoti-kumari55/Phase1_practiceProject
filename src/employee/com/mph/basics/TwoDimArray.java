package employee.com.mph.basics;

import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;

import javax.naming.AuthenticationException;

public class TwoDimArray {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the no of rows");
	int rows = scanner.nextInt();
	
	System.out.println("Enter the no of cols");
	int cols = scanner.nextInt();
	
	int a[][]=new int[rows][cols];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.println("enter the value of "+ i + " rows and "+ j+" col");
			a[i][j]=scanner.nextInt();
		}
	}
	
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(a[i][j]+" ");
			
		}
		System.out.println();
	}

  }
	
}

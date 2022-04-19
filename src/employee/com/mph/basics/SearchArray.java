package employee.com.mph.basics;


import java.util.Arrays;
import java.util.Scanner;

public class SearchArray {
public static void main(String[] args) {
	int a[] = {3,2,76,5,32,40,11,67,47};
	Arrays.sort(a);
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the key element to search");
	int element=sc.nextInt();
	int flag=0;
	int i=0;
	for(i=0;i<a.length;i++) {
		if(a[i]==element) {
			flag=1;
			
			break;
		}
		else {
			flag=0;
			
		}
	}
	
	
	if(flag==1) {
		System.out.println("element is found at index: "+ i);
	}
	else {
		System.out.println("element is not found :");
	}
}


	
}


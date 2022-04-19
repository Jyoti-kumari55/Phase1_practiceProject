package employee.com.mph.basics;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	int a[] = {5,6,8,3,2,18,13,16,1,11,12};
	Arrays.sort(a);
	System.out.println("Sorted arrays:");
	for (int j:a) {
		System.out.print(j+",");
	}
	System.out.println();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the key element to search");
	int element=sc.nextInt();
	int low=0;
	int high=a.length-1;
	int mid=0;
	while (low<=high) {
		mid = low+high/2;
		if(a[mid]==element) {
			System.out.println("element is found at the index of "+mid);
break;
		}
		else if(a[mid]<element) {
			low=mid+1;
			high=a.length-1;
		}
		else {
			low=0;
			high=mid-1;
		}
	}
  }
}

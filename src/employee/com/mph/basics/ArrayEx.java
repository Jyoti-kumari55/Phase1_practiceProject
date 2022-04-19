package employee.com.mph.basics;

import java.util.Scanner;

//import javax.print.attribute.standard.Chromaticity;

public class ArrayEx {
	public static void main(String[] args) {
		int empno;
		char gender;
		double salary;
		float salaryb;
		  byte by;
			short sh;
			boolean b;
			long l;
		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the values of empno");
			empno=sc.nextInt();
			System.out.println("eneter the gender");
			gender=sc.next().charAt(0);
			System.out.println("eneter the salary");
			salary = sc.nextDouble();
			System.out.println("eneter the salaryb");
			salaryb = sc.nextFloat();
			System.out.println("eneter the byte");
			by = sc.nextByte();
			System.out.println("eneter the short");
			sh = sc.nextShort();
			System.out.println("eneter the long");
			l = sc.nextLong();
			System.out.println("eneter the boolean");
			
				System.out.println("b");
				
			System.out.println(empno+"  "+gender+ " " +salary+" "+salaryb+" "+by+" " +sh+" "+l+" ");
	}
	}



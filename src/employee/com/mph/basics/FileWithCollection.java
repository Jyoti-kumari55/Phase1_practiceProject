package employee.com.mph.basics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWithCollection {
		public static void main(String[] args) throws IOException {
		String path="C:\\File Created\\";
		Scanner sc=new Scanner(System.in);

		ArrayList<String> al=new ArrayList<>();
		while(true) {
		System.out.println("enter the file name to create");
		String filename=sc.next();
		String finalname=path+filename;
		System.out.println(finalname);

		//create a file 

		File f=new File(finalname);
		boolean b=f.createNewFile();
		if(b!=true) {
			System.out.println("the file not created");
		}
		else {
			al.add(filename);
			System.out.println("file created");
			//break;
		}

		System.out.println("the collection of files is "+ al);
		
		}
	
		}
}

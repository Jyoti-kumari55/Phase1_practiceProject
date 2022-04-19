package employee.com.mph.basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileContentIntoOtherFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("c.txt");
		
		int i=0;
		//EOF (-1)
		while((i=fis.read())!=-1) {
			 fos.write(i);
			
		}
		System.out.println();
		System.out.println("Copy completed");
		fis.close();
		
	}
	}

	


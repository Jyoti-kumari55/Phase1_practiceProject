package employee.com.mph.basics;

import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {
		public static void main(String[] args) throws IOException {
			FileInputStream fis=new FileInputStream("a.txt");
			if(fis!=null) {
				System.out.println("file is in read mode");
			}
			int i=0;
			//EOF (-1)
			while((i=fis.read())!=-1) {
				//if we want file to read data in character we use -char:
				//System.out.print((char)i);
				System.out.println(i);
			}
			System.out.println();
			System.out.println("read operation completed");
			fis.close();
			
		}
		}

		
		
		
		
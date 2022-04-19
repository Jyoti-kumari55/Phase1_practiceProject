package employee.com.mph.basics;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileAndWrite1 {
	public static void main(String[] args) throws IOException {
		//if we want to write something in file more and previous data also .So use "boolean =true":
	       FileOutputStream fOS = new FileOutputStream("b.txt",true);
		if(fOS!=null) {
			System.out.println("file created in open in write mode:");
		}
		String file = " how your work going?";
		byte[] b = file.getBytes();
		fOS.write(b);
		System.out.println("Write operation is completed:");
			fOS.close();
		}
	}



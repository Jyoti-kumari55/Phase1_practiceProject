package employee.com.mph.basics;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
public static void main(String[] args) throws IOException {
       FileOutputStream fOS = new FileOutputStream("a.txt");
	if(fOS!=null) {
		System.out.println("file created in open in write mode:");
	}
	String file = "Hi JYOTI , How Are You ?";
	byte[] b = file.getBytes();
	fOS.write(b);
	System.out.println("Write operation is completed:");
		fOS.close();
	}
}



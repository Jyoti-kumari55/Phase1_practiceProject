package employee.com.mph.basics;

import java.io.File;
import java.io.IOException;

public class FileDisplay {
	
		public static void main(String[] args) throws IOException {
		String path="C:\\File Created\\";
		File f=new File(path);
		File filename[]=f.listFiles();
		for(File ff:filename) {
			System.out.println(ff.getName());
		}
		}
		}






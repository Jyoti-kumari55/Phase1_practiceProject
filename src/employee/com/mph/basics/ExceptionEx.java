package employee.com.mph.basics;

public class ExceptionEx {
public static void main(String[] args) {
	System.out.println("HELLO");
	try {
		int b[]= {2,3,4,5,6};
		try {
		b[7]=50;
		}
		catch (Exception e) {
			// TODO: handle exception
		System.out.println(e);
		}
	int a=50/0;
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	System.out.println("hello");
	
}
}



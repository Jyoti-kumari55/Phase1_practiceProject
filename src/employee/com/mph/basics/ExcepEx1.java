package employee.com.mph.basics;

public class ExcepEx1 {
	public static void main(String[] args) {
	System.out.println("Hi");
	try {
	int a=50/0;
	}
catch (Exception e) {
//		// TODO: handle exception
		System.out.println(e);
}
	finally {
		System.out.println("finally block executed");
	}
	System.out.println("hello");

}
}
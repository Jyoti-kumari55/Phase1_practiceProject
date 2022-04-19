package employee.com.mph.basics;

public class WrapperEx1 {
@SuppressWarnings("removal")
public static void main(String[] args) {
		
		//unboxing 
		//converting the wrapper class obj to pdt
		Integer i=new Integer(12);
		int j=i;
		//Boxing-converting one type to another
		System.out.println(j);
		
		//autoboxing -converting the pdt to the wrapperclass object
		int a=10;
		Integer b=a;
		System.out.println(b);
		
	}

}




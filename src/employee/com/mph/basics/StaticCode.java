package employee.com.mph.basics;

class ExmOfStatic {
	//here by using static counter give new value
	static int counter=0;
	
	//constructor
	ExmOfStatic(){
		counter++;
		System.out.println(counter);
	}
}
public class StaticCode {
		@SuppressWarnings("unused")
		public static void main(String args[]) {
			ExmOfStatic s=new ExmOfStatic();
			ExmOfStatic s1=new ExmOfStatic();
			ExmOfStatic s3=new ExmOfStatic();	
		}

	}








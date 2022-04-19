package employee.com.mph.basics;

class MethodRT {
		
	 int empno;
	 String empname;
	 double salary;
	//method created with argument:
	 double incrSalary(double bonus)
	 {
	 	return salary + bonus;
	 }
	 }
public class MethRTwithArg {
	 	public static void main(String args[]) {
	 		MethodRT m = new MethodRT();
	 		m.salary=50000;
	 		System.out.println(m.incrSalary(5000));
	 	}
	 }






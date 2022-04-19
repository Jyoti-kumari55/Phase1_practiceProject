package employee.com.mph.basics;

class Method12{
	int empno;
	String empname;
	double salary;
	double bonus = 5000; 
	void incrSalary() {
			System.out.println(salary + bonus);
	}
}

public class MethWoutRTWoutArg {
	public static void main(String agrs[]) {
		Method12 me = new Method12();
		me.salary = 50000;
		me.empname = "JYOTI";
		me.incrSalary();
		//System.out.println(me);
	}	

}

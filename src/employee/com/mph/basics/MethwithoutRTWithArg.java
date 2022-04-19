package employee.com.mph.basics;

class Method1{
	int empno;
	String empname;
	double salary; 
	void incrSalary(double bonus) {
			System.out.println(salary + bonus);
	}
}


public class MethwithoutRTWithArg {
	public static void main(String agrs[]) {
		Method1 me = new Method1();
		me.empno = 121;
		me.salary = 50000;
		me.empname = "JYOTI";
		me.incrSalary(500);
		//System.out.println(me);
		
		
	}

}
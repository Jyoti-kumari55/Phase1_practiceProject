package employee.com.mph.basics;

class Method2 {
	int empno;
	String empname;
	double salary; 
	double incrSalary() {
		return salary + 5000;	
	}
}

public class MethRTWithoutArg {
	public static void main(String agrs[]) {
		Method2 p = new Method2();
		p.salary=50000;
		System.out.println(p.incrSalary());
		
		
	}
}



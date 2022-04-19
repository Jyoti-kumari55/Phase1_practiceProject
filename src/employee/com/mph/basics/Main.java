package employee.com.mph.basics;
class Employee{
	//data
	int empno;
	String empname;
	double salary;
	//method
	double incrSalary(double bonus) {
	return salary+bonus;	
	}

}

public class Main {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.salary=50000;
		System.out.println(e.incrSalary(5000));

	}
}



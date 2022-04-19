package employee.com.mph.basics;

//Write a java program with a class name Employee which has the fields empno:int,
//empname:String,empsalary:double. Create a method incrSalary which add a bonus of 5000 
//to the empsalary and prints the final amount Create a main class and display the status of
//the method with creating 3 emp objects


class Emplo_yee{
	int empno;
	String empname;
	double empSalary;
	public double incrSalary(double bonus) {
		return empSalary + bonus;
		
	}
}

public class AssignEmployee {
	public static void main(String agrs[]) {
		Emplo_yee emp = new Emplo_yee();
		emp.empno = 121;
		emp.empname = "Jyoti";
		emp.empSalary = 50000.0;
	System.out.println(emp.empno +" "+ emp.empname +" "+ emp.empSalary);
	
	Emplo_yee emp1 = new Emplo_yee();
	emp1.empno = 128;
	emp1.empname = "Advika";
	emp1.empSalary = 60000.0;
    System.out.println(emp1.empno +" "+ emp1.empname +" "+ emp1.empSalary);

    Emplo_yee emp2 = new Emplo_yee();
	emp2.empno = 130;
	emp2.empname = "Amit";
	emp2.empSalary = 80000.0;
    System.out.println(emp2.empno +" "+ emp2.empname +" "+ emp2.empSalary);

	}

} 

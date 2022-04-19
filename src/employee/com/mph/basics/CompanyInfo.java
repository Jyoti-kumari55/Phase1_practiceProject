package employee.com.mph.basics;

//Create a class Companyinfo which has id,name,companyname We assign the values of the companyname 
//is taken as a hardcorded value=mphasis.We assign id and name with the constructor Create a 
//method change()->companyname=wipro. Create a method display to print the companyname

class Company{
	String empName;
	int emp_id;
	static String companyName = "Mphasis";
	public Company(int id,String name) {
		this.emp_id = id;
		this.empName = name;
	}
	public void change () {
		this.companyName = "WIPRO";
	}
}

public class CompanyInfo {

@SuppressWarnings("static-access")
public static void main(String[] args) {
    Company c1=new Company (1000, "JYOTI");
    c1.change();
    System.out.println("Name is "+c1.empName+", Id is "+c1.emp_id+" and Company name is "+c1.companyName);
    System.out.println();
    
    Company c2=new Company(1002, "ADVIKA");
    System.out.println("Name is "+c2.empName+", Id is "+c2.emp_id+" and Company name is "+c2.companyName);
    System.out.println();
    
    Company c3=new Company(1006, "SUMIT");
    System.out.println("Name is "+c3.empName+", Id is "+c3.emp_id+" and Company name is "+c3.companyName);
    System.out.println();
    
  }

}




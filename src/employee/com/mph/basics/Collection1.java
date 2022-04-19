package employee.com.mph.basics;

import java.util.ArrayList;

import java.util.Iterator;

 class EmploDetail {
	
		int empno;
		String empname;
		public EmploDetail(int empno, String empname) {
			super();
			this.empno = empno;
			this.empname = empname;
		}
	}
		
	public class Collection1 {
		public static void main(String[] args) {
			
			EmploDetail emp1=new EmploDetail(101, "karthik");
			EmploDetail emp2=new EmploDetail(102, "kk");
			EmploDetail emp3=new EmploDetail(103, "pp");
			//duplication in Arraylist is allowed
			EmploDetail emp4=new EmploDetail(103, "pp");
			//array of objects ->collection
			
			ArrayList<EmploDetail> al=new ArrayList<>();
			al.add(emp1);
			al.add(emp2);
			al.add(emp3);
			al.add(emp4);
			
			java.util.Iterator<EmploDetail> i=al.iterator();
			while(i.hasNext()) {
				EmploDetail e=(EmploDetail) i.next();//object ref
				System.out.println(e.empname+"  "+e.empno);
			}
			
			
		}

	}


		

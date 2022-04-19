package employee.com.mph.basics;

	class Student{
		int sid;
		String sname;
		public Student(int sid, String sname) {
			super();
			this.sid = sid;
			this.sname = sname;
		}
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + "]";
		}
		
		
	}
	public class ArrayWithObject {
	public static void main(String[] args) {

		Student s1=new Student(1,"JYOTI");
		Student s2=new Student(2, "ANKIT");
		Student s3=new Student(3,"CHAUDHARY");
		Student s[]=new Student[3];
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		
		for(Student ss:s) {
			System.out.println(ss);
		}
		
	}
	}




package employee.com.mph.basics;

import java.util.HashSet;

   public class Collection5 {
       public static void main(String[] args) {
    	   //constructor of default hashset:
	HashSet<Integer> hSet = new HashSet<>();
	
	hSet.add(null);
	hSet.add(34);
	hSet.add(0);
	hSet.add(56);
	//duplication is not allowed
	hSet.add(34);
	hSet.add(87);
System.out.println(hSet);
}
}

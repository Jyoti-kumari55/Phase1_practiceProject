package employee.com.mph.basics;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Collection6 {
	  public static void main(String[] args) {
			LinkedHashSet<Integer> hSet = new LinkedHashSet<>();
			
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

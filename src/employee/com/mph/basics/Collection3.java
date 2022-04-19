package employee.com.mph.basics;

import java.util.ArrayList;

public class Collection3 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		//adding objects - which are non generic(not similar type)
		list.add(12);
		list.add("kk");
		list.add(22.0);
		//duplication is allowed:
		list.add(12);
		list.add("kk");
		list.add(22.0);
		list.add(null);
		list.add(0);
		list.add(1);
		
		
		
		//add object generic type-similar type
		//java -> 5 ->class and objects ->PDT(convience of work)
		//we have classes for the PDT ---->Wrapper classes    1.5
		
		System.out.println(list);
		
	}

}



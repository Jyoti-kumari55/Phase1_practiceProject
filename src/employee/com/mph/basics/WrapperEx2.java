package employee.com.mph.basics;

import java.util.ArrayList;
import java.util.Iterator;

public class WrapperEx2 {
public static void main(String[] args) {
		
		ArrayList<Integer> al=new  ArrayList<>();
		al.add(23);
		al.add(25);
		al.add(1);
		System.out.println(al);
		
		//for,for-each,iterator
		System.out.println("for");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

		System.out.println("for-each");
		for(Integer i:al) {
			System.out.println(i);
		}
		
		System.out.println("iterator");
		Iterator<Integer> j=al.iterator();//in j we get the address of base arraylist
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		
	}

}




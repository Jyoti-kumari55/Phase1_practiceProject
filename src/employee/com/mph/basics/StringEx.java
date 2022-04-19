package employee.com.mph.basics;

public class StringEx {

	public static void main(String[] args) {
		String s = "abcdefghi";
		String s1 = "abcd";
		
		System.out.println("Length is:" +s.length());
		System.out.println("convert to Uppercase:" +s.toUpperCase());
		System.out.println("Fetch a character at a desired location: " +s.charAt(4));
		System.out.println("Fetch index of the character: " +s.indexOf('f'));
		System.out.println("Substring model1: " +s.substring(3));
		System.out.println("Substring model1: " +s.substring(3,8));
		System.out.println("Equals :" +s.equals(s1));
		System.out.println(s.hashCode()+"  "+s1.hashCode()+" "+(s==s1));
		System.out.println("comparision of strings "+s.compareTo(s1));
		System.out.println("concatenation "+s.concat(s1));//s+s1
		
		String s2="abcd-efg-fij";
		System.out.println("splitting");
		String l[]=s2.split("-");
		for(String f:l) {
			System.out.println(f);
			String s4=" abcdef  ";
			System.out.println("trimming is -"+s4.trim());
			int a=1;
			String c=a+"";
			System.out.println("Coversion of int into string: "+ c);//s+	
		}
    }
}

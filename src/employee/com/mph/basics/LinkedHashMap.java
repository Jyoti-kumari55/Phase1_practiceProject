package employee.com.mph.basics;

public class LinkedHashMap {
	public static void main(String[] args) {
		java.util.LinkedHashMap<Integer, String> linkhm = new java.util.LinkedHashMap<>();
		linkhm.put(3, "KK");
		linkhm.put(null, "KK");
		linkhm.put(null, null);
		linkhm.put(2, "pp");
		linkhm.put(6, "sharma");
		
		System.out.println(linkhm);
	}

}

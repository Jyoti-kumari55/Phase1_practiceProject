package employee.com.mph.basics;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class LinkedHashMiterator {
public static void main(String[] args) {
	LinkedHashMap<Integer, String> LM = new LinkedHashMap<>();
	LM.put(34, "ll");
	LM.put(34, "hh");
	LM.put(null, null);
	LM.put(56, null);
	LM.put(89, null);
	LM.put(23, "jj");
	LM.put(null ,"ss");
	LM.put(54, "mm");
	Set set = LM.entrySet();
	Iterator i = set.iterator();
	while ( i.hasNext()) {
		Map.Entry map=	(Entry) i.next();
		System.out.println(map.getKey()+"   "+map.getValue());

	}
}
}
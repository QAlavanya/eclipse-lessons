package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;

public class htable {

	public static void main(String[] args) {

		Hashtable<String,String> ht = new Hashtable();
		ht.put("1", "Sri");
		ht.put("2", "Sai");
		ht.put("3", "Madhu");
		ht.put("4", "Rama");
		
		System.out.println(ht.get("3"));

		Enumeration e = ht.elements();
			
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		
		
	}

}

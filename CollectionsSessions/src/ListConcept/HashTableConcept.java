package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	// Hashtable is synchronized - thread safe - at a time only one thread can be accessed in hash table
	// Hashtable stores the values in the form of key-value pair format.
	// key --> Object - hashcode --> value
	// In hashtable key is stored in the form of object and each and every object inside the java is having one special unique 
	       //identifier that is called hashcode and for that particular hashcode one value is associated
	// Hashtable stores the the value on the basis of the key
	// no null key and null values
	// performance will be slow since it is thread safe and only one thread can be accessed at a time.
	
	public static void main(String[] args) {

      Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		System.out.println(h.size());
		System.out.println(h.get(2));		
		System.out.println(h.get("B"));
		
		h.put(3, "Sai");   // here key is integer and value is string, any values are accepted
		h.put("D", 500);
		System.out.println(h.get("D"));
		
		Hashtable <Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(4, 700);
		h1.put(5, 900);
	//	h1.put("E", 800);  -- here the key is String is not accepted since we have given in h1 to accept only integer
		
		Hashtable <String,Integer> h2 = new Hashtable<String,Integer>();
		h2.put("F", 300);
	//	h2.put(6, 600)   --  here the key is integer is not accepted since we have given in h2 to accept only string
		
		System.out.println(h2.size());
		System.out.println(h2.get("F"));
		System.out.println(h.get("F"));   // in method h the key F is not present so will give null as output
		System.out.println("******");
	// to create a clone copy/shallow copy
	    Hashtable h3 = new Hashtable();	 // here we created an object but we are not storing an values
		
		h3 = (Hashtable)h.clone();      // here we are moving all the values of h into h3 by clowning,
		        							// so we have to typecast into hashtable
		System.out.println("Values from h: "+h);
		System.out.println("Values from h3: "+h3);
		System.out.println("*********");
		
		// to clear all the values in an object
		h.clear();
		System.out.println("Values from h: "+h);
		System.out.println("Values from h3: "+h3);
		System.out.println("*********");

		// contains value
		Hashtable nh = new Hashtable();
		nh.put("A", "First");
		nh.put("B", "Second");
		nh.put("C", "Third");
		nh.put("D", "Forth");
		
		if (nh.containsValue("Second"))
			System.out.println("Value is found for second");
		
		if (nh.containsValue("Fifth"))
			System.out.println("Value is found for fifth");  // did not return any value bcoz, we don't have fifth
		System.out.println("*********");
			
		// to print all the values from hashtable using -- Enumeration - elements()
		Enumeration e = nh.elements();
		System.out.println("Values from the hashtable nh");
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		System.out.println("*********");
		
		// to print all the values from hashtable using -- entryset() -- set of hashtable values
		
		System.out.println("Print all the values using entryset");
		Set s = nh.entrySet();
		System.out.println(s);
		System.out.println("*********");
		
		Hashtable nh1 = new Hashtable();
		nh1.put("A", "First");
		nh1.put("B", "Second");
		nh1.put("C", "Third");
		nh1.put("D", "Forth");
		nh1.put("D", "Forth");   // even if we give same values again hashtable returns only unique values
	//	nh1.put(null, "sixth");  // doesn't accept null key or null values, so will throw an error NullPointerException
	//	nh1.put("E", null);       // will throw an error NullPointerException
		
		System.out.println("Size of nh1: "+nh1.size());
		System.out.println("Values from nh1");
		System.out.println(nh1);
		System.out.println("*********");

		
		// check both the hashtables are equal or not
		if(nh.equals(nh1))
		System.out.println("Both are equal");
		System.out.println("*********");

		//to get the values from a key
		System.out.println(nh1.get("Value from the key: "+"A"));
		System.out.println("*********");

		// to get the hashcode of the hashtable object
		System.out.println("Hashcode value of nh1: "+ nh1.hashCode());	
		System.out.println("Hashcode value of nh: "+ nh.hashCode());	
		System.out.println("*********");
		
		// generics
		Hashtable <String,String> nh3 = new Hashtable<String,String>();
		System.out.println("*********");
		
		
	}

}

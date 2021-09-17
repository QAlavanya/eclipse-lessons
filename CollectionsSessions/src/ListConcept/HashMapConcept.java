package ListConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {

	// Hashmap is part of map family and extends abstract map and implements map interface.
	// it contains only unique elements
	// hashmap stores the values in the form of key-value pair format
	// it may have one null key and multiple null values.
	// it maintains no order
	// hashmap is non synchronized - not thread safe - it means if it is used in multi threading environment,
	// then more than one thread can be accessed by hashmap simultaneously (performance will increase automatically)
	// whenever we have to use fast performance system then we have to use hashmap since it is non synchronized
	// concurrent modification exception - fail-fast condition - means whenever we are calling a particular hashmap
	// if any modification is happening in between by some other thread then concurrent modification exception will happen

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Sai");
		hm.put(2, "Sri");
		hm.put(3, "madhu");
		hm.put(5, "lavanya");

		System.out.println(hm.get(1));
		System.out.println(hm.get(4)); // doesn't throw error, but gives null
										// for output as there is no key as 4.
		System.out.println("*****");
		// to print all the values we have to use for loop
		// for(Map.entry m = hm.entrySet()) - this statement is changed to entry(java.util.map)
		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		hm.remove(5);
		System.out.println("After removing");
		System.out.println(hm); // even this statement prints all the values present
		System.out.println("*****");
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>(); // with reference to employee class
																			
		// here integer is for employee no
		Employee e1 = new Employee("Tom", 25, "QA");
		Employee e2 = new Employee("Steve", 30, "Tester");
		Employee e3 = new Employee("Martha", 35, "Dev");
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		// to traverse the haspmap
		for (Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.print("employee " + key + " info:"+ " ");
			System.out.println(e.name + " " + e.age + " " + e.dept);	
		}
		System.out.println("*****");	
		
		HashMap<String,String>	hm1 = new HashMap<String,String>();
		hm1.put("K1", "V1");
		hm1.put("K2", "V2");
		hm1.put("K3", "V3");
		hm1.put("K4", "V4");		
		System.out.println(hm1.get("K1"));
		System.out.println(hm1.get("K2"));
		
		System.out.println("*****");	
		for(Entry m1 : hm1.entrySet()){
			System.out.println(m1.getKey()+" "+ m1.getValue());
		}

	}

}

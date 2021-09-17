package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {

		int a[] = new int[3]; // this is a static array - size is fixed

	// dynamic array -- arraylist
	// 1. duplicate values/elements are allowed
	// 2. maintains insertion order
	// 3. synchronized - not thread safe as per multi threading concept thats why its slow
	// 4. allows random access to fetch the element bcoz it stores the values on the basis of indexes.
		
		ArrayList ar = new ArrayList(); // non generic arraylist object

		ar.add(10); // 0
		ar.add(20); // 1
		ar.add(30); // 2
		System.out.println(ar.size());

		ar.add(40); // 3
		ar.add(50); // 4
		ar.add(50); // 5
		ar.add("Sri");
		ar.add(23.22);
		ar.add('C');
		ar.add(true);
		System.out.println("Size before removing: "+ ar.size()); // size of array
		System.out.println("Value of index 7 before removing: "+ar.get(7));
		ar.remove(7);
		System.out.println("Size after removing: "+ ar.size()); 
		System.out.println("Value of index 7 after removing: "+ar.get(7));

		System.out.println(ar.get(4)); // to get the value from an index.
		System.out.println("*****");
		// to print all the values in the array we have to use
		// 1. for loop
		// 2. using iterator
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// Non Generics Vs Generics :  generics are available after JDK1.5

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		// ar1.add("Sai"); throws an error bcoz we have given defined generics to be a integer and gave a string value

		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Sai");
		// ar2.add(30);

		// in generics we can define primitive data types like integer, 
		// non primitive data types like string, and class objects also like Employee

		ArrayList<E> ar3 = new ArrayList<E>();

		// Employee class objects:
		Employee e1 = new Employee("Sai", 3, "PreK");
		Employee e2 = new Employee("Sri", 6, "Ele");
		Employee e3 = new Employee("Madhu", 40, "IT");

		// Create ArrayList:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);

		// if we want to use all the items in the arraylist we have to use
		// iterator - to traverse the values:
		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) { // we cant use for loop here, bcoz iterator
								// doesn't work on the basis of indexes
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("*******");
		// **************
		// addAll()
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Sai");
		ar5.add("Sri");
		ar5.add("madhu");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Rani");
		ar6.add("Rao");
		ar6.add("Rama");

		ar5.addAll(ar6);

		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));

		}
		System.out.println("*****");
		// removeAll():
		ar5.removeAll(ar6);
		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		System.out.println("******");
		// retainAll():
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Sai");
		ar7.add("Sri");
		ar7.add("madhu");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Sri");
		ar8.add("Sai");
		ar8.add("Rama");

		ar7.retainAll(ar8);
		for (int i = 0; i < ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}

	}

}

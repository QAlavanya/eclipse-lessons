package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		
		ar.add(100);   // 0 - index
		ar.add(200);   // 1
		ar.add(300);   //2
		System.out.println(ar.size());
		
		ar.add(400);   // 3
		ar.add(500);   // 4
		System.out.println(ar.size());
		
		ar.add("Sri");   //5
		ar.add("Hello");  //6
		ar.add('P');     //7
		ar.add(12.33);    //8
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));
	//	System.out.println(ar.get(9));    throws an error bcoz array size 9 doesn't exist
		System.out.println("*****");
		
		ar.add("Sri");      //9
		System.out.println("Array Size before removing is: "+ ar.size());
		
		ar.remove(9);
		System.out.println("Array Size after removing is: "+ ar.size());
		
		// to print all the values in the arraylist we have to use for loop
		for(int i =0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		
	// If you want to restrict ur values to only one data type, give that data type in the brackets
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
	//	ar2.add("Sri");   - in this case the value given is a string 
		                // only integer value is accepted, since integer is given in the method
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Sri");
	//	ar2.add(500);     - in this case the value given is an integer only string value is accepted,
			
	}

}

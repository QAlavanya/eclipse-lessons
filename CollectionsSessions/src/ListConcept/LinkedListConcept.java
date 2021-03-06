package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList <String> ll= new LinkedList <String>();
		
		//add():
		ll.add("Sai");
		ll.add("Sri");
		ll.add("Madhu");
		ll.add("Rani");
		ll.add("Rao");
		System.out.println("Contents in the Linked List: "+ ll);
		
		//addfirst:
		ll.addFirst("Lavanya");  // This is added before the index 0 present right now 
		//addlast:
		ll.addLast("Rama");
		System.out.println("Contents in the Linked List: "+ ll);
		
		//get:
		System.out.println("Linked list for index 0: "+ ll.get(0));
		
		//set;
		ll.set(0, "amma");   // replaces the present value with the value given in set
		System.out.println(ll.get(0));
		
		// remove first and last
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents in the Linked List: "+ ll);
		
		ll.remove(4);
		System.out.println("Contents in the Linked List: "+ ll);
		
		//how to print all the values of linkedlist:
		//for loop
		System.out.println("Using for loop");
		for(int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
				
		//advance for loop
		System.out.println("Using Advance for loop");
		for(String str : ll){
			System.out.println(str);
		}
		
		//iterator
		System.out.println("Using Iterator");
		Iterator <String> it = ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//while loop
		System.out.println("Using while loop");
		int num = 0;
		while(ll.size()>num){
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
	}

}

package working.examples;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist {
	
	static void list(){
		
		ArrayList arrlist = new ArrayList(5);
		ArrayList <String> names = new ArrayList();
				
		arrlist.add(1);
		arrlist.add(12);
		arrlist.add(25);
		arrlist.add(34);
		
		names.add("one");
		names.add("two");
		names.add("three");
		names.add("four");
		names.add("five");
		
	// to get the arraylist displayed
		
		for(int i=0;i<arrlist.size();i++){
			System.out.println(arrlist.get(i));
		}
		System.out.println("**********");
		
	//	To search for an element in the list.
		
		String search = "f";
		
		for(int i=0;i<names.size();i++)
		{
			if(names.get(i).contains(search))
			{
				System.out.println(names.get(i));
			}
		}
		System.out.println("**********");
		
	//  To print the elements of the list using iterator
		
		ListIterator<String> Listitr = names.listIterator();
		while(Listitr.hasNext())
			System.out.println(Listitr.next());
		
		System.out.println("**********");
		
	//  To print the elements reverse order using ListIterator
		
		while(Listitr.hasPrevious())
		System.out.println(Listitr.previous());
	}

	public static void main(String[] args) {
		
		 Arraylist.list();

	}

}

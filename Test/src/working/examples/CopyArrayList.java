package working.examples;

import java.util.ArrayList;

public class CopyArrayList {

	static void CpyArrList(){
		
		ArrayList<String> arrlist = new ArrayList();
		arrlist.add("One");
		arrlist.add("Two");
		arrlist.add("Three");
		arrlist.add("Four");
		arrlist.add("Five");
		
		System.out.println("Actual ArrayList is: "+ arrlist);
		
		String [] Array = new String [arrlist.size()];
		arrlist.toArray(Array);
		System.out.println("After copying to an Array: ");
        for(String str:Array)
        {
            System.out.println(str);
        }
	}
	public static void main(String[] args) {
		
		CopyArrayList.CpyArrList();
	}

}

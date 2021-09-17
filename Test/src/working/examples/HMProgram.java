package working.examples;

import java.util.HashMap;
import java.util.Map;

public class HMProgram {

	static void HMProg(){
		
		HashMap<Integer,String> HMP = new HashMap <Integer,String> ();
		
		HMP.put(1, "one");
		HMP.put(2, "two");
		HMP.put(3, "three");
		HMP.put(4, "four");
		HMP.put(5, "five");
		
		for(int i=1;i<=HMP.size();i++)
			System.out.println(HMP.get(i));		
		
	//  To search for a key in the created map and then returns its value
		
		for(Map.Entry<Integer, String> entry : HMP.entrySet())
		{			
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+" : "+value);
		}
		
	}
	
	public static void main(String[] args) {
		
		HMProgram.HMProg();

	}

}

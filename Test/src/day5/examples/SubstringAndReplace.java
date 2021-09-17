package day5.examples;

public class SubstringAndReplace {

	   static void Replace() {
		   
		   String x = "How are you ";
			
			System.out.println("The Actual string is : " + x);
			System.out.println(x.substring(3));
			System.out.println(x.replaceAll("How", "Happy"));
	   }
	   
	public static void main(String[] args) {
		
		SubstringAndReplace.Replace();
		
								
	}
		
}




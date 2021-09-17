package day5.examples;

// input "this is Java" to reverse individual word in a string as "siht si avaj"

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {

        String st,reverse = "";
	    
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String: ");
		st = scanner.nextLine();

		for(int i = st.length()-1;i >= 0;i--)
		   {			   
			   reverse = reverse + st.charAt(i);
		   }
  
		 System.out.print("Reverse Words in the String are : " + reverse);
	}

}

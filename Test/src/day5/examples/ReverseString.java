package day5.examples;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
	       
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String st = scanner.nextLine();
			
		   String a[] = st.split(" ");
			
		   System.out.print("Reverse of the String is :  ");
		
		   for(int i = a.length-1; i >= 0; i--)
		   {			   
			  System.out.print(a[i]+ " ");
		   }
	}

}

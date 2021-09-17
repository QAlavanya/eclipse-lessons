package day5.examples;

import java.util.Scanner;

public class PalindromeString {

	static void PalinString() 
	{	
        Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the String : ");	
		
		String str = scan.nextLine();
		
		String reverse = "";
		
		for(int i=str.length()-1; i>=0; i--)			
				reverse += str.charAt(i);
			
		if (reverse.equalsIgnoreCase(str))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is Not a Palindrome");		
	}
	
	public static void main(String[] args)	{

		 PalindromeString.PalinString();
	}

}

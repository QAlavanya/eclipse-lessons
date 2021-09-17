package day5.examples;

//given input is "This is java"  to print as "This1 is2 Java3"

import java.util.Scanner;

public class Printstringpattern {
	
	public static void main(String[] args) 
	{
		
	      Scanner scan = new Scanner(System.in);
	//	  System.out.print("Enter the String: ");
		  String x = scan.nextLine(); 
		  System.out.print("Enter the String: ");
			 
		 
		  for(int i=0;i<=x.charAt(0);i++)
		  System.out.print(x +" "+ 1 );
	
  }
}

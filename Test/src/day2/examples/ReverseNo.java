package day2.examples;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int num= sc.nextInt();
		int a[]= new int[num];
		System.out.println("enter the array elements");
		for(int i=0;i<num;i++)
		{
	        a[i]=sc.nextInt();
		}
      
	    System.out.println("Reverse array:");
	
	    for(int i=a.length-1;i>=0;i--)
	    {
		   System.out.println(a[i]);
	    }
			
	}
}

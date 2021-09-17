package day3.examples;

public class Fibonacci {
	
//    to print 0 1 1 2 3 5 8 13 21 ...n
	
	public static void main(String[] args) {
		
	    int i=0;
		int j=1;
		int n=100;

		System.out.print(i); 
		System.out.print(" ");
		System.out.print(j);
		  {
            for(int k=1;k<=n;k++)
        	   
            {
              k=j+i;
        	  System.out.print(" ");
        	  System.out.print(k);	
        	  i=j;
        	  j=k;
            }

		  }
   
	}    

}

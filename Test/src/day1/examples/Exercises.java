package day1.examples;

public class Exercises {
	
	static void star(){
	//	for (int i=0;i<=4;i--){
		
		   for(int j=4;j>=0;j--){
		
			   for(int k=j;k>=0;k--)
			   {
					System.out.print(" ");
			   }	
			    System.out.print(" * ");
		    	System.out.print(" ");
			  
			    System.out.println(" ");
	    	}
	//	}	
		
	/*	for(int i=1;i<=4;i++){
			for(int j=i;j<=4;j++){
				System.out.print( j + "  ");
			}
			
			System.out.println("\n");
		}  */
		
		
	} 
	
	public static void main(String[] args) {
	
	Exercises.star();

	}

}

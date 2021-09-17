package JavaBasics;

public class PatternsUsingForLoop {

	public static void main(String[] args) {

	 /*  *  *  *  *  * 
		 *  *  *  *  * 
		 *  *  *  *  * 
		 *  *  *  *  * 
		 *  *  *  *  *    */
		for(int i=1;i<=5;i++)
		{
			System.out.println();
			for(int j=1;j<=5;j++)
			{
			System.out.print(" * ");			// for star square pattern
		//	System.out.println(" "+ i +" ");    // for number square pattern
			}
		}		
		System.out.println("-----");
		
	/*   1 
		 2  2 
		 3  3  3 
		 4  4  4  4 
		 5  5  5  5  5  */
		
		int m=1;
		for(int k=0;k<=5;k++){
			System.out.println();
			for(int l=2;l<=m;l++){
			//	System.out.print(" * ");		// for star down pyramid pattern
				System.out.print(" "+k+" ");    // for number down pyramid pattern
			}
			m++;
		}
		System.out.println("-----");
		
	/*   5  4  3  2  1 
		 4  3  2  1 
		 3  2  1 
		 2  1 
		 1     */
		
		
		int r=5;
	
		for(int q=5;q>=1;q--){
			System.out.println();
			for(int p=r;p>=1;p--){
				System.out.print(" "+p+" ");	// for reverse number square pattern
			}
			r--;						// for reverse down pyramid pattern
		}
		System.out.println("-----");

		int e=5;
		for(int c=0;c>=5;c++){
			System.out.println();
			for(int d=0;d<=e;d--){
				System.out.println(" "+d+" ");
			}
			e--;
		}
		
		
	}

	

}

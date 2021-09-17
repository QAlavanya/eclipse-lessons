package day5.examples;


public class MissingNumber {
	
		static void MissNo(){
			
				int [] a = {1,2,3,4,6,7,8};
				int mn = getmissingnumber(a,8);
				
				System.out.println("Missing Number is : " + mn);		
			}

			private static int getmissingnumber(int[] a, int n) {

				int s=0;
				int sum = n*(n+1)/2;
				for(int i: a)
				{
					s=s+i;
				}		
				return sum-s;
			}
			
	public static void main(String[] args) {
	 
		MissingNumber.MissNo();
				
	}

}

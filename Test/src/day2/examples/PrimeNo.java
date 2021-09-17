package day2.examples;

public class PrimeNo {
	
   //no should be divided by 1 and itself
	 static void prime(){
		 
		 int n = 9;
		 boolean isPrime = true;
		 
		 for(int i=2;i<n;i++)
		 {
			 if (n%i==0)
			 {
				isPrime = false;
				break;
			 }
		 }
		 
		 if (isPrime)
		 {
			 System.out.println(n+ " is a Prime No");
		 }
		 else
		 {
			System.out.println("n is not a prime no");
		 }
	 }
	
	public static void main(String[] args) {
		
		PrimeNo.prime();
	}

}

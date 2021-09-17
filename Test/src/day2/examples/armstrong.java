package day2.examples;

public class armstrong {

	public static void main(String[] args) {

		int i =371;
		int temp = i;
		int n,sum=0;
						
        while(i>0)
	        {
	        	n=i%10;
	        	i=i/10;
	        	sum= sum+ (n*n*n);
	        }
		if (temp == sum)
			System.out.println("This number is an Armstrong Number");
		else 
			System.out.println("This number is not an Armstrong Number");
	}

}

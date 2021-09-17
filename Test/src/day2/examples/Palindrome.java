package day2.examples;

public class Palindrome {

	public static void main(String[] args) {

		int a=151;
		int b=a;
		int rev=0;
		int sum = 0;
		while(a>0)
		{
			rev=a%10;
			a=a/10;
			sum = sum*10 + rev;
		}
		if(b == sum)
			System.out.println("This is a Palindrome Number");
		else
			System.out.println("This is not a Palindrome Number");
		}

}

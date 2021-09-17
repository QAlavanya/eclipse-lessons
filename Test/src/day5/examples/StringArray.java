package day5.examples;

public class StringArray {

	public static void main(String[] args) {

	   String x = "Lavanya";
		
		System.out.println("Hello" + " " + x);
		
		System.out.println(x.toUpperCase());   // for uppercase letters
		
		System.out.println(x.substring(2));   
		System.out.println(x.substring(2,5));
		System.out.println(x.charAt(3));
		
		String age = "35";
		String salary = "17389.75";
		
		int a = Integer.parseInt(age) + 2;
		System.out.println(a);
		
		double sal = Double.parseDouble(salary) * .10;
		System.out.println(sal);

		
		
	/*	System.out.println("************");
		
		int a[] = {10,20,30,40,50};
		
		System.out.println(a.in);
		
		System.out.println(a[]);
		*/
		
				
	}

}

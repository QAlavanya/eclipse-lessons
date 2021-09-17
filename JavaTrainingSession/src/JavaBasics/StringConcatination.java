package JavaBasics;

public class StringConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// +: Concatenation operator
		// print ln: is used to print on the console in a new line
		// print : is used to print on the console
		
		int a =100;
		int b=200;
		
		String s1 = "Hello";
		String s2 ="World";
		
		double d=12.33;
		double c=33.56;
		
		System.out.println(a+b);
		System.out.println(s1+" "+s2);
		System.out.println(a+b+s1+s2);
		System.out.println(s1+s2+a+b);
        System.out.println(s1+s2+(a+b));
        System.out.println(a+b+s1+s2+a+s1+b+s2);
		System.out.println(a+b+s1+s2+a+b);
		System.out.println(c+d);
		System.out.println(s1+s2+c+d);
		System.out.println("The value of a+b is " +a+b);
		System.out.println("The value of a+b is " +(a+b));
		System.out.print("I Love");
		System.out.println(" Sai");
		System.out.println(" and Sri");
		
		
		
	}

}

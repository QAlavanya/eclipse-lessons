package JavaBasics;

public class ConstructorWithThiskeyword {

	String name;   // class variables or global variables
	int age;
	
	public ConstructorWithThiskeyword(String name, int age){    // local variables
		// to initialize global variables with the current value of the constructor we use This keyword 
		this.name = name;   // this.global variable = local variable
		this.age = age;		
		// we can also give a diff name for global variable and local variable and 
		//give global variable =local variable  like    name1 = name; without this keyword
		//if its same name we have to use this keyword, otherwise java will be confused.
				
		System.out.println(name);
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {

		ConstructorWithThiskeyword obj = new ConstructorWithThiskeyword ("Sri",6);
		
		
	}

}

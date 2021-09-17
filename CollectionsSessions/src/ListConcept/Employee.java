package ListConcept;

public class Employee {

	String name;
	int age;
	String dept;
	
	Employee(String name,int age,String dept){    // here employee is a constructor
		// the name in constructor is different from the local variables we declared 
	    // to initialize this thing
		//if global variable and local variable names are same in that case we have to use this keyword.

		this.name = name;    //global variable = local variable
		this.age = age;
		this.dept = dept;
		
		
		
		
		
		
		
	}
	
	
	
}

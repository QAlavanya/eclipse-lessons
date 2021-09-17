package OOPSConcept1;

public class StaticAndNonStaticConcept {

	// global variables :  scope of global variables will be available across all the functions with some conditions
	String name = "Sri";     // non static global variable
	static int age = 3;      // static global variable
	
	public static void main(String[] args) {
    //how to call the static methods (sum) and variables we can call by  2 ways 
		//-  1.direct calling  2. calling by class name
	
	// calling static methods
		System.out.println("Calling Static Methods");
		sum();                        // direct calling 
		StaticAndNonStaticConcept.sum();      // calling by class name
		
	//calling static variables	
		System.out.println("Calling Static Variables");
		System.out.println("age: "+ age);          // direct calling 
		System.out.println("age: "+ StaticAndNonStaticConcept.age);    // calling by class name
		// static methods and variables are not part of the object
		
	//how to call non static methods and variables -  by creating the object
		System.out.println("Calling Non Static Methods");
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendmail();
		System.out.println("name: "+obj.name);
		
	//can we access static methods by using object reference?  Yes
		obj.sum();     // warning will be given.		
	}

	public void sendmail(){      // non static method
		System.out.println("Send Mail method");
	}
	
	 public static void sum(){    // static method
		 System.out.println("sum method");
	 }
}


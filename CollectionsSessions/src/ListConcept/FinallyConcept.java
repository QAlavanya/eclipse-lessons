package ListConcept;

public class FinallyConcept {

	// finally is a block
	public static void main(String[] args) {
	    //	test1();
		//  test2();
		division();
	}           // finally keyword is always used with try catch block
	            // finally block is always executed no matter what you have in try catch either with exception or without exception

	public static void test1(){
		try{
			System.out.println("Inside test1 method");
			throw new RuntimeException("test");
		} catch(Exception e){
			System.out.println("Inside Catch Block");
		}
		finally{
			System.out.println("Inside Finally block");
		}
			System.out.println("********");	
	}
			
	public static void test2(){
		try{
			System.out.println("Inside test2 method");
		}
		finally{
			System.out.println("finally code in the test2 method");
		}
	}
	
	public static void division(){
		int i=10;
		try{
			System.out.println("inside try block");
			int k=i/0;                 // in this case this is a arithmetic exception
		}
		/*catch(ArithmeticException e){            // we are catching that exception in catch block
			System.out.println("Inside catch block");
			System.out.println("Divide by zero error");
		}*/
		
		catch(NullPointerException e){      // here we are not catching arithmetic exception, but catching null pointer exception
			System.out.println("Inside catch block");   //so even if there is an exception we are not catching the arithmetic exception
			System.out.println("Divide by zero error");  // so it throws an error and executes finally block
		}
		finally{
			System.out.println("Finally code is executed");
		}
	}
	
	
}

package TestMain;

public class TestBase {

	// Showing If main method can be overloaded.
	
	//JVM will try to search for main(String args[]), doesn't look for any other methods  
	// we cannot create duplicate main methods, but can create same main method with different parameters
	public static void main(String[] args) {		// array parameter
		System.out.println("Main Method 1");
		main("Testing");
		main(10);
		main(20,30);
	}
	public static void main(String args) {		// normal string parameter
		System.out.println("Main Method 2");
	}
	
	public static void main(int a) {		
		System.out.println("Main Method 3");
	}
	
	public static void main(int a, int b) {		
		System.out.println("Main Method 4");
	}
}

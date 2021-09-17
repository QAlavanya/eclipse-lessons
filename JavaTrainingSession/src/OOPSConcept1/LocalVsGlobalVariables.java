package OOPSConcept1;

public class LocalVsGlobalVariables {

	// Global Variables or class variables
	String name = "Sai";
	int age = 3;
	// to access the global variables you have to create an object and call them
	// into the main method

	public static void main(String[] args) {

		int i = 10; // local variables for main method
		System.out.println(i);

		// class name should be used to create an object
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}

	public void sum() {
		int i = 15; // i, j, age - local variables for sum method
		int j = 20;
	}

}

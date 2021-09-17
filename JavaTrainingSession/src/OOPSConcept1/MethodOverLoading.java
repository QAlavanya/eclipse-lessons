package OOPSConcept1;

public class MethodOverLoading {

	// method overloading: when method name is same with diff arguments/params
	// with diff data types within the same class is called MOL
	public static void main(String[] args) {

		MethodOverLoading obj = new MethodOverLoading();
		obj.sum();
		obj.sum(10);
		obj.sum(10.11);
		obj.sum(5, 10);
	}

	public static void main(int p) {

	}

	public static void main(int x, int y) {

	}
	// we can overload the main method with different parameters or arguments
	// you cannot create a method inside a method
	// duplicate methods: same method name with same no. of arguments are not allowed.
	// same method name with different data types are allowed

	public void sum() { // 0 input parameters
		System.out.println("sum method...zero parameters");
	}

	public void sum(int i) { // 1 input parameters
		System.out.println("sum method... with 1 param");
		System.out.println(i);
	}
	public void sum(double i) { // 1 input parameters with diff data type
		System.out.println("sum method... with 1 param with diff data type");
		System.out.println(i);
	}
	public void sum(int k, int l) {
		System.out.println("sum method...with 2 param");
		System.out.println(k + l);
	}

}

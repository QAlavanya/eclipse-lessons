package JavaBasics;

public class B extends A {

	// super class keyword should be the first statement in the child class
	// constructor
	// Super keyword is always used to call parameterized parent class
	// constructor.
	// if you haven't written super keyword, it calls the default parent class
	// we can have only one Super Keyword in one child class constructor

	// if I want to call all the constructors in the parent class then we can
	// create one more object and call the constructors

	public B() {
		super();
		System.out.println("Child class constructor");
	}

	public B(int i) {

		super(i);
		System.out.println("Child class constructor with 1 param");
	}

	public B(int i, int j) {

		super(i, j);
		System.out.println("Child class constructor with 2 params");
	}

	public static void main(String args[]) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10, 20);

	}
}

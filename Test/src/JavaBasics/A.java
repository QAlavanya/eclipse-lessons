package JavaBasics;

public class A {

	// by default we have a constructor, since there is nothing to return, it will not be printed
	// but explicitly if we have written a constructor, it prints what we have given in syso command
	
	
	public A(){
		System.out.println("Parent class constructor");
	}
	
	public A(int i){
		System.out.println("Parent class constructor with value of i: "+i);
	}
	
	public A(int i, int j){
		System.out.println("Parent class constructor with value of i: "+i);
		System.out.println("Parent class constructor with value of j: "+j);

	}
	
}

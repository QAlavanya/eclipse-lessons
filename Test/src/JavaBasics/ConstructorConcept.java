package JavaBasics;

public class ConstructorConcept {

	// constructor means its a class entity which is used to define some class features while creating the object 
	// in the form of global variables in the form of objects
	// CONSTRUCTOR NAME SHOULD BE SAME AS CLASS NAME
	// constructor will not return any value
	// constructor can be overloaded
	// constructor will be called immediately when u create an object for this particular class
	// to call a method, if its a non static method we have to create an object, by using the object reference we have to call it for the functions(methods)
	// for constructor, the moment u create an object automatically the constructor will be called
	// there is a default constructor by default, even if you don't create it
	// duplicate constructors are not allowed, we have to overload it
	
	public ConstructorConcept(){  // this is a default constructor, so its having zero parameters
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i){
		System.out.println("Single param constructor");
		System.out.println("value of i:"+i);
	}
	
	public ConstructorConcept(int i, int j){
		System.out.println("2 params constructor");
		System.out.println("value of i:"+i);
		System.out.println("value of j:"+j);
	}
	
	
	public static void main(String[] args){
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);

	}
	
}

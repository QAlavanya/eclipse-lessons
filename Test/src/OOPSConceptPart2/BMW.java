package OOPSConceptPart2;

public class BMW extends Car{   // this is called "has-a relationship"  
	// BMW is parent & Car is child (before extends is parent and after extends is child)
	
//Method Overriding: when same method is present in parent class as well as in child class with same name & same no of arguments,it is called MOR
  
	// Example: All cars have almost similar way of running the vechicles, 
	//		    but some have a diff design or diff features for BMW like safety feature.
	//			all the other properties of the car can be overloaded, means can be used by every other car manufacturer.
	
	public void start(){            // overridden method
		System.out.println("BMW start...");
	}
	public void theftsafety(){
		System.out.println("BMW -- theftsafety ");
	}
	
	
}

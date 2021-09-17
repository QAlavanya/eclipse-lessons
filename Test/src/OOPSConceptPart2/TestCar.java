package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {

	// compile time polymorphism or static polymorphism   - bcoz at the time of compilation java will decide which method to call
		BMW b = new BMW();
		b.start();       //if there is same method in parent and child class with same arguments then child class method will be called
		b.stop();
		b.refuel();
		b.theftsafety();  
		b.engine();
		
		System.out.println("*****");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
	//	c.theftsafety();   --- throws an error bcoz parent cannot access all child class methods
		                        //since theftsafety is a BMW class method 
		System.out.println("*****");						
		
		// top casting  -  casting of the child class object with parent class referring variable it is called top casting.
		Car c1 = new BMW();     // Child class object can be referred by the parent class reference variable - dynamic polymorphism or Runtime Polymorphism
		c1.start();             // only overridden methods and parent class methods can be called using dynamic polymorphism
		c1.stop();
		c1.refuel();
	//	c1.theftsafety();   throws an error in runtime polymorphism, can only be accessed in compile time polymorphism
		
		//down casting   
	//	BMW b1 = (BMW)new Car();   //down casting is possible if we covert the object the parent class object into child referring variable
		// but at the run time it will give you an exception - ClassCastException
	}

}

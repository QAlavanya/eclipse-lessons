package AbstractionConcept;

// we have to use interface only when we want to hide the complete business/implementation logic
// inside the interface when ever we define a methods we have to achieve a full abstraction
// In Interface we can define only abstract methods - ie only method declaration and no method body
// we don't have to write even the abstract keyword
// we r not going to define any business logic in the interface - thats how we get 100% abstraction
// we cannot create the object of interface (Car) bcoz it is abstract in nature.
// abstract classes are faster than interface
// Performance wise Interface is slower than Abstract class.
// In Interface the child class inherit from multiple parent interfaces but not multiple parent classes.

public interface Car {

	// In interface we can have only static and final variables
    int wheels= 4;   // by default this variable is treated as final and static
    
	public void start();
	public void stop();
	public void refuel();
		
}

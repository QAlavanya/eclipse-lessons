package OOPSConceptPart2;

public interface USBank {

	int min_bal = 100;
	
	public void credit();     
	
	public void debit();
	
	public void transfermoney();
	
	// no main method in interface
	// only method declaration - no method body, only method prototype
	// no static method in interface, bcoz interface is part of object oriented programming, objects can never be static in java
	// In interface we can declare variables, variables are by default static in nature
	// variables value will not be changed, its final/constant in nature
	// we cannot create the object of interface
	// Interface is abstract in nature
	// In interface we have to implement all the methods available
    // In interface we can achieve multiple inheritance, ie a child class can implement multiple interfaces, 
	    												//but can inherit only one parent class

}

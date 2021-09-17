package AbstractionConcept;

public abstract class Bank {

	// Abstract class is used when ever we need partial abstraction
	// In abstract class we can have any kind of variables- static, non static, final
	
	int amt = 100;    // non static variable
	final int rate = 10;   // final variable
	static int loanrate = 5;   //  static variable
	
	// In abstract class there should be atleast one method which is abstract in nature
	// abstract class can have abstract methods as well as non abstract methods
	// i.e there should be only method prototype(method declaring) but no method body
	// you can have multiple abstract methods, multiple non abstract methods
	// This is a partial abstraction example. not 100% abstraction. 
	// since we r overriding only loan method and not credit and debit methods
	// Performance wise abstract classes are faster than Interface.
	// we cannot create the object of Abstract classes bcoz its abstract in nature.
	
	public abstract void loan();   // abstract method -- no body
	
	// non abstract methods
	public void credit(){
		System.out.println("Bank1 --- credit");
	}
	
	public void debit(){
		System.out.println("Bank1 --- debit");
	}
		
}

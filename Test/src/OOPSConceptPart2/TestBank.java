package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
	// static variables (min_bal in USBank) if available in class can be called by class name.
	// static variables if available in interface can be called with interface name.
	// USBank b = new USBank();  --- throws an error, bcoz USBank is an interface and in interface we cannot create an object
		
		System.out.println("USBank minimum balance is: " + USBank.min_bal);
		
	// USBank.min_bal = 200;   -- throws an error, bcoz in interface the value of the variables cannot change
	
	// compile time polymorphism - bcoz 3 methods are getting overridden	
		HSBCBank hsbc = new HSBCBank();
		hsbc.credit();
		hsbc.debit();
		hsbc.transfermoney();
		hsbc.educationloan();
		hsbc.carloan();
		
	//dynamic polymorphism - child class object can be referred by the parent interface reference variable
		USBank b = new HSBCBank();    // only overridden methods can be called
		b.credit();
		b.debit();
		b.transfermoney();
	}
}

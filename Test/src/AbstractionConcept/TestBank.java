package AbstractionConcept;

// Abstraction means to hide some business logic(implementation logic)
// through dynamic polymorphism also we can call all the methods and overridden methods also
public class TestBank {

	public static void main(String[] args) {

		HDFCBank hb = new HDFCBank();
		
		hb.credit();    // methods from parent class
		hb.debit();     // methods from parent class
		hb.loan();      // overridden method 
		hb.funds();    // non overridden method available only in HDFC Bank class
		// hb.funds can only be accessed only by HDFC Bank referring variable
		
		Bank b = new HDFCBank();
		b.loan();
		b.credit();
		b.debit();
    // you cant call b.funds - hdfc bank here bcoz the referring variable here is b and not hb 
			
	//	Bank b1 = new Bank();     you cannot create this bcoz, bank is a abstract class
		                      // you cannot create the object of abstract class		
	}

}

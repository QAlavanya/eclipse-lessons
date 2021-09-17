package AbstractionConcept;

public class HDFCBank extends Bank{
   
	@Override
	public void loan(){            // we are overriding the abstract class bank class
		System.out.println("HDFC2 --Loan Method");
	}
	
	public void funds(){
		System.out.println("HDFC2 -- Funds");
	}

	
	
	
}

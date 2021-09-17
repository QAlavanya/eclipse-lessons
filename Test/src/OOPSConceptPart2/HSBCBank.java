package OOPSConceptPart2;

public class HSBCBank implements USBank, BrazilBank{  // we are acheiving multiple inheritance
	// also called as a "is-a relationship" (Interfacing class)

   // if a class is implementing any interface, then its mandatory to define/override all the methods of interface.
   
	// overridden from USBank
	@Override
	public void credit() {
		System.out.println("HSBC -- credit");
	}
	@Override
	public void debit() {
		System.out.println("HSBC -- debit");		
	}
	@Override
	public void transfermoney() {
		System.out.println("HSBC --transfermoney");		
	}
	
	//overriding from BrazilBank
	public void mutualfund(){
		System.out.println("HSBC -- mutualfund");
	}
	@Override
	public void insurance() {
		System.out.println("HSBC -- insurance");

	}
	
	// seperate methods of HSBC class   or non overridden methods
    public void educationloan(){
    	System.out.println("HSBC --education loan");
    }
	public void carloan(){
		System.out.println("HSBC -- carloan");
	}
	
	

	
	
}

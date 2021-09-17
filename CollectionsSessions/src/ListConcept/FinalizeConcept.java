package ListConcept;

public class FinalizeConcept {
		
	// finalize is a method
	public static void main(String[] args) {	
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();
		
	}
	
	public void finalize(){       // for finalize we don't have to call this method in main method, it will automatically be called 
		System.out.println("Finalize method");	
	}
	
	
}

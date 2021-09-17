package AbstractionConcept;

// BMW is the child of Car interface we have to use implements keyword

public class BMW implements Car{     // hover over BMW and add BMW unimplemented methods

	@Override          // These are the overridden methods from car interface
	public void start() {
		System.out.println("BMW --start");
	}

	@Override
	public void stop() {
		System.out.println("BMW -- stop");
	}

	@Override
	public void refuel() {
		System.out.println("BMW -- refuel");
	}

	// non overridden methods
	
	public void theftsafety(){
		System.out.println("BMW -- theftsafety");
	}
		
}

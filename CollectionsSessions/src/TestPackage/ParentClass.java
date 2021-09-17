package TestPackage;

public class ParentClass {
//if we declare public final class parentclass, then the child class cannot extends with parentclass
	// to prevent inheritance
	// to prevent method overridding
	
	public void start(){
		System.out.println("parent --start method");
	}
}

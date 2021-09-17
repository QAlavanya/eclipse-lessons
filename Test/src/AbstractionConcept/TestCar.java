package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();   // can be accessed bcoz we are accessing by the BMW class object
		
		// dynamic polymorphism - child class object can be referred by parent class/interface reference variable
		
		Car c = new BMW();       // dynamic polymorphism or top casting
		c.start();
		c.stop();
		c.refuel();
	//	c.theftsafety();    cannot be accessed bcoz it is avaiable only in BMW class - this object is referred by Car and not BMW
				
	}
}

package OOPSConcept1;

public class Car {

	//class variables or global variables
		int model;
		int wheel;
		
	public static void main(String[] args) {


		Car a = new Car();    // new Car() - the object of car class
		Car b = new Car();    // a,b,c - object referring variables
		Car c = new Car();     // new keyword is used to create the object
		// we cannot create a duplicate object refering variable
		
		a.model = 2018;
		a.wheel = 4;
		
		b.model = 2017;
		b.wheel = 4;
		
		c.model = 2016;
		c.wheel = 4;
		
		System.out.println("Before assigning the references");
		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println(b.model);
		System.out.println(b.wheel);
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		System.out.println("After assigning the references");
		a=b;
		b=c;
		c=a;
		a.model =10;
		System.out.println(a.model);   // 10
		c.model = 20;
		System.out.println(a.model);   //20   - since we have given as c=a , a.model=20
		System.out.println(c.model);

		
		
		
		
	}

}

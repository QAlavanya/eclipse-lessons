package JavaBasics;

public class Singleton {

	// In OOP, a singleton class is a class that can have only one object/instance of the class at a time.
	// To design a singleton class - 1.make sure the constructor of that class as private.
	// 2. write a static method that has return type object of this singleton class.(lazy initialization)
	
	private static Singleton st_instance = null;
	public String str;
	
	private Singleton(){
		str = "This is a singleton class pattern";
	}
	
	
	public static void main(String[] args) {

		
		
		
	}

}

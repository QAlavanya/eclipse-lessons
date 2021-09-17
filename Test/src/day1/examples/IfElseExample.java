package day1.examples;

public class IfElseExample {

	public static void main(String[] args) {
		
		int age=19;
		boolean HasBeenTicketed;
		
		
		if (age >=18) {
			System.out.println("You are qualified to have a License");
			if(HasBeenTicketed = true){
				System.out.println("Bcoz you are ticketed, sorry to Cancal your License");
			}
		}
		else if (age >= 16 && age < 18){
			System.out.println("You are qualified to have a minor License");
		}
		else if (age < 18){
			System.out.println("You are not qualified to have a License");
		}
		
	/*	int age=17;
		if (age >=18) {
			System.out.println("You are qualified to have a License");
		}
		else if (age >= 16 && age < 18){
			System.out.println("You are qualified to have a minor License");
		}
		else if (age < 18){
			System.out.println("You are not qualified to have a License");
		}
	*/	
		
	/*	 int x = 10;
		 int y=20;
		 if (x > y){
			 System.out.println("x is greater than y");
		 } else if ( x == y){
			 System.out.println("x is equal to Y");
		 }else if (x < y){
			 System.out.println("x is less than y");
		 }
	*/	 		 
	}

}

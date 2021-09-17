package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//while loop
		//disadvantage of while loop: if we don't give increment or decrement part it will end in infinite loop
		int i=0;		// initialization
		while(i<=10){	// conditional
			System.out.println("i is "+i);
			i++;		// increment or decrement 
			//i=i+2;
		}
		System.out.println("-------");
		//for loop
		int j=1;
		for(j=1;j<=10;j++){	//initialization, increment, condition
			for(int k=10;k>=0;k--){
			System.out.print(k);
			}
			System.out.print("*");
			
		}
		
		
		
		
		
	}

}

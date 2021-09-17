package JavaBasics;

public class IfElseondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i= 60;
		int j=50;
		
		if(i>j){
			System.out.println("i is greater than j");
		}
		else{
			System.out.println("j is greater than i" );
		}
			
		if(i==j){
		System.out.println("i and j are equal");
		}
		else
		{
			System.out.println("i and j are not equal");
		}
		// comparision operators:  < , > , <= , >= , == , !=
		// true & true =true
		//true & false = false
		//false & true =false
		
		int k=40;
		if(i>=j & i>=k){
			System.out.println("i is greater than j");
		}
		else if(j>k){
			System.out.println("j is greater than k");
		}
		else {
			System.out.println("k is greater than j and i");
		}
	
	
	
	}

}

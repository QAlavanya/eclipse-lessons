package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 30;
		int j= 20;
		
		if(j>i){
			System.out.println("j is greater than i");
		}
		else{
			System.out.println("i is greater than j");
		}
		
		int a=20;
		int b= 20;
		if (a==b){
			System.out.println("a is equal to b");
		}
		else{
			System.out.println("a is not equal to b");
		}
		
		int a1 =50;
		int b1= 60;
		int c1 = 30;
		if((a1>b1) & (a1>c1)){
			System.out.println("a1 is greater than b1 and c1");
		}
		// else if (b1>c1)  - can use this logic also
		else if ((b1>a1) & (b1>c1)){
			System.out.println("b1 is greater than a1 and c1");
		}
		else {
			System.out.println("c1 is greater than a1 and b1");
		}
	}

}

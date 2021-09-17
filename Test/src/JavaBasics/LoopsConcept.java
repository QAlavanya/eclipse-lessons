package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while loop
		//disadvantage of while loop: it will generate a infinite loop if we don't give increment/decrement part
		int i=0;    // initialization
		while (i<=10){    // condition
			System.out.println(i);
			i=i+1;   // increment/decrement
		}
	System.out.println("*********");	
		
	//for loop
		for (int j=0;j<=10;j++){
			System.out.println(j);
		}
		System.out.println("******");
		System.out.println("post increment");
		int p =1;
		int q = p++;    // post increment
		
		System.out.println(p);
		System.out.println(q);
		System.out.println("******");
		System.out.println("pre increment");
		
		int r=1;
		int s = ++r;     // pre increment
		
		System.out.println(r);
		System.out.println(s);
		System.out.println("******");
		System.out.println("post decrement");
		
		int t=4;
		int u = t--;
		System.out.println(t);
		System.out.println(u);
		System.out.println("******");
		System.out.println("pre decrement");
		
		int v=4;
		int w=--v;
		System.out.println(v);
		System.out.println(w);
		
	}

}

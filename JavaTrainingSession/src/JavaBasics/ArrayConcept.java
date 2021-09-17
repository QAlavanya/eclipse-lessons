package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

	//	 Disadvantages: -only static arrays are stored(fixed size of array) -- to over come this we use collections - arraylist,hashtable - use dynamic array
	// - stores only similar data type -- to over come we use object array
		
		// int array
		int i[] = new int [4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[0]);
		System.out.println(i[3]);
	//	System.out.println(i[4]);	// will throw an ArrayOutOfBoundException error since we don't have i[4] 
		
		System.out.println(i.length); 		// for size of the array
		
		for(int j=1;j<i.length;j++){
			System.out.println(i[j]);
			
			
		// double array
		double d[]=new double[3];	
		d[0]= 10.77;
		d[1]= 11.33;
		d[2]= 15.67;
		System.out.println(d[2]);

		//char array
		char c[] = new char[2];
		c[0]='q';
		c[1]='S';
		
		// boolean array
		boolean b[]=new boolean [2];
		b[0]=true;
		b[1]=false;
		
		// string array
		String s[]=new String[3];
		s[0]="Hello";
		s[1]="Sri";
		s[2]="Sai";
	
		//Object array
		Object ob[]=new Object[5];
		ob[0]="Madhu";
		ob[1]=07;
		ob[2]=20.14;
		ob[3]="09/02/2011";
		ob[4]='F';
		System.out.println(ob[4]);
							
		}
	}

}

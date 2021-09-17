package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array:  to store similar data types in a array variable
		// [] - one dimensional array
		/* disAdvantage of Array:
		 * 1. size is fixed  - i.e static array - to overcome this problem we use collections - arraylist, hashtable - (dynamic array)
		 * 2. stores only similar data types  -  to overcome this problem we use - object array
		 */
	//	int array
		int i[] = new int [4];  // this is a static array - here you have to give the size first
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
	//	System.out.println(i[4]);   //  gives an error ArrayIndexOutofBoundsException
		System.out.println(i.length);   //gives the size/length of the array
		 System.out.println("******");
		// to print all the values of the array: use for loop
		
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
		}
		 System.out.println("******");
	// double array
		double d[]= new double[3];
		d[0]= 12.33;
		d[1]= 22.23;
		d[2]= 24.55;
		System.out.println(d[2]);
		 System.out.println("******");
	// char array
		char ch[]= new char[2];
		ch[0] = 'A';
		ch[1] = '$';
		System.out.println(ch[1]);
		 System.out.println("******");
	// boolean array
		boolean b[]= new boolean [2];
		b[0]= true;
		b[1] = false;
		System.out.println(b[0]);
        System.out.println("******");
	// string array
		String s[] = new String[3];
		s[0]= "Hello";
		s[1]= "Welcome";
		s[2]= "Good Bye";
		System.out.println(s[1]);
		System.out.println(s.length);
		System.out.println("******");
	//object array    -  its a super class of all the classes - object is a class - used to store diff data types values
		Object ob[]= new Object[5];
		ob[0] = "Lavanya" ;
		ob[1] = 25;
		ob[2] = 11.23;
		ob[3] = "2/28/2018";
		ob[4] = 'F';
		System.out.println(ob.length);
		System.out.println(ob[0]);
	
		
		}
		
		
	}



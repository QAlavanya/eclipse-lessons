package OOPSConcept1;

public class FunctionsInJava {

	// in some programs we call functions and in some programs, we call methods - both are same
	// we cannot create a function in a function, method in a method
	// one object will be created, obj is the reference variable, referring to this object
	// after creating this object, a copy of all non static methods will be given to this object
	// objects can store only non static methods and functions	
	//main method is void bcoz it never returns anything

		public static void main(String[] args) { // main() is also a function
			
			FunctionsInJava obj = new FunctionsInJava();   // object of the class: new keyword
			
			obj.test();

			int l = obj.sum();
			System.out.println(l);

			String s1 = obj.QA();
			System.out.println(s1);

			int div = obj.division(30, 10);
			System.out.println(div);
		}

		// non static methods
		// 3 types - where we give input and get output where we dont give input
		// still get output where we dont give input and dont get output
		// void - doesn't return any value,  return type = void
		
		public void test() { // no input, no output
			System.out.println("test method");
		}

		// return type for c = integer - thats why we wrote public int sum()
		public int sum() { // no input, some output
			System.out.println("Sum method: ");
			int a = 10;
			int b = 20;
			int c = a + b;
			return c;
		}

		public String QA() { // no input, some output
			System.out.println("QA Method: ");
			String S = "Lavanya";
			return S;
		}

		// x,y - input parameters/arguments
		public int division(int x, int y) {
			System.out.println("division method: ");
			int d = x / y;
			return d;
		}

	}

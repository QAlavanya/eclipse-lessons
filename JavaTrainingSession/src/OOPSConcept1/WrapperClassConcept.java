package OOPSConcept1;

public class WrapperClassConcept {
	
	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);

		// data conversion: String to int
		int i = Integer.parseInt(x);
		System.out.println(i + 20);

		// String to Double
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d + 11.22);

		// String to boolean
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);

		// int to string conversion
	    int j = 12345;
		System.out.println("Before converting to string the value of j: " + j + 20);
		String s = String.valueOf(j);
		System.out.println("After Converting: "+ s + 20);
		
		String u = "100A";
		Integer.parseInt(u); // will throw an error as NumberFormatException as
								// it is not a pure number '100A'

	}

}

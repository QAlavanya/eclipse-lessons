package day5.examples;

public class Swap2Numbers {

	static void SwapNoTemp(){
	// swaping 2 nos using a temp variable	 
		int a[] = { 1,2,3,5,6,4};
		int b=3;   // 3,4,5 are the array indexes
		int c=5;
		int d=4;
		int temp = a[b];
		a[b] = a[c];		
		a[c] = a[d];
		a[d]=temp;
		
		for (int i=0;i<a.length;i++)
			System.out.print(a[i]+ " ");
	}
		
	public static void main(String[] args) {
	
		  Swap2Numbers.SwapNoTemp();
		 
		
	}

}

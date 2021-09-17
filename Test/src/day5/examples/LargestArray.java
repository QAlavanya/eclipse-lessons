package day5.examples;

public class LargestArray {

	static void LargeNo() {
		
		int a[] = new int[] {50,20,10,40,70};
		
		int temp = a[0];
		
		for (int i=0; i<a.length; i++)
		{
			if(temp < a[i])
			{
				temp = a[i];
			}
		}
		
		System.out.println("The Largest number in the Array is: " + temp );	
	}
	public static void main(String[] args) {

	/*int a[] = new int[] {50,20,10,40,70};
	
	int temp = a[0];
	
	for (int i=0; i<a.length; i++)
	{
		if(temp < a[i])
		{
			temp = a[i];
		}
	}
	
	System.out.println("The Largest number in the Array is: " + temp );	*/
	
	   LargestArray.LargeNo();
  }

}

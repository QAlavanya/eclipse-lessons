package day5.examples;

public class SortingQuicksort {

	static void Quicksort(){
		
int [] a = {2,16,5,9,18};
		
		for(int i=1;i<=a.length;i++);
		{
			 for(int j=0;j<a.length-1;j++)
			 {
				 int k =j+1;
				 int p = a[j];
				 int q = a[k];
				 if (q<p)
				 {
					 int temp1 = p;
					 int temp2 = q;
					 a[j] = q;
					 a[k] = p;					 
				 }
			 }			 
		}
		
		for(int b=0; b<a.length; b++)
		   System.out.print(a[b]+ " ");	
	}
	
	public static void main(String[] args) 	{
					
		SortingQuicksort.Quicksort();
	}

}

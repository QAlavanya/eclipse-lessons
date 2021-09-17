package day5.examples;

public class CommonNo {
	
	static void comno(){
		
		int i[] = new int [] {10,20,30,40,50};
	    int j[] = new int [] {40,50,60,70,80};
	
	    for(int a=0; a<i.length; a++)
	    {
	    	for(int b=0; b<j.length; b++)
	    	{
		       if(i[a]==j[b])
		      {
		       System.out.println("Common No in the Array is : " + i[a]);
		      }	
            }
	    }	
    }
	public static void main(String[] args) {
		
	       CommonNo.comno();	
			
	  }
}

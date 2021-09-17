package OOPSConcept1;

public class CallByValueAndCallByReference {

	int p;
	int q;

	public static void main(String[] args) {

		CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
		int x = 10;
		int y = 20;
		obj.testsum(x,y);     // call by value or pass by value
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		//after swaping
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int testsum(int a, int b){
		a = 30;
		b = 40;
		int c = a+b;
		return c;
	}
     // call by ref is possible by using the object references by passing the object references
	public void swap(CallByValueAndCallByReference t){
		int temp;
		temp = t.p;    // temp = 50
		t.p = t.q;     // t.p = 60
		t.q = temp;    // t.q = 50
	}
}

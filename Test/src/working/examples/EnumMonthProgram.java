package working.examples;

public class EnumMonthProgram {

	public enum Months{
		
		Jan ("January","01"),
		Feb ("February","02"),
		Mar ("March","03"),
		Apr ("April","04"),
		May ("May","05"),
		Jun ("June","06"),
		July ("Jul","07"),
		August ("Aug","08"),
		September ("Sep","09"),
		October ("Oct","10"),
		November ("Nov","11"),
		December ("Dec","12");
		
		private final String desc;
		private final String number;
		
		Months (String description,String monthno){
			desc = description;	
			number = monthno;
		}		
		public String getdesc(){
			return desc;		
		}
		public String getnumber(){
			return number;
		}		
	}
	
	public static void main(String[] args) {
		
		for(Months names: Months.values() )
        System.out.printf(" %s \t %s \t %s \t \n " , names , names.getdesc(), names.getnumber());	
	}

}

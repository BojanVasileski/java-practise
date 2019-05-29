package day36_wrapperClasses_arrayLists;

public class Boxing {
	public static void main(String[] args) {
		//AUTOBOXING
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		System.out.println(num2);
		
		//UNBOXING
		
		Double d1= new Double (34.2);
		double d2 = d1;
		
		long l1 = new Long(600000);
		
		Integer num3 = Integer.valueOf(345);
		//Double d3 = num3;  casting not possible with wrapper class
		
		
		
	}
}

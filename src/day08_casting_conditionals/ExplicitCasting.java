package day08_casting_conditionals;

public class ExplicitCasting {
	public static void main(String[] args) {
	
		System.out.println(10/2.0);   //result is alvays the variable that takes more memory space
		int result = (int)(10/2.0);
		System.out.println(result);
		
		int rent1 = 989;
		int rent2 = 1002;
		int rent3 = 894;
		int rent4 = 1234;
		
		double average = (rent1 + rent2 + rent3 + rent4) / 4;
		
		System.out.println(average);
		
		double d = 40.2;
		int i = (byte)d;
		
		//in above statement both expicit and implicit casting happes.
		
		System.out.println(i);
		
		
	}
}

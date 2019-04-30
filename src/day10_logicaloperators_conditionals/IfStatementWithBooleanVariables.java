package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVariables {
public static void main(String[] args) {
	boolean isBreakTime = false;
	if(isBreakTime == true) {
		System.out.println("BREAK TILL 8:35 PM");
	}else {
		System.out.println("Not Break time yet.");
	}
	
	
	//second version
	
	if(isBreakTime) {
		System.out.println("BREAK TILL 8:35 PM");
	}else {
		System.out.println("Not Break time yet.");
	}
	boolean classTime = false;
	
	if(classTime == false) {
		System.out.println("Come back on time");
		System.out.println("Stop talking");
		System.out.println("Pay Attention");
		System.out.println("Code and have fun!");
	} else {
		System.out.println("Take a walk and have some water");
	}
	
	boolean qualified = true;
	if(qualified) {
		System.out.println("Your applicaton was not approved. Thank you");
	}
	
	boolean isNiceWater = true;
	int hourlyRate = 50;
	if(!(hourlyRate >40) ) {
		System.out.println("too low");
	}else {
		System.out.println("rate is good");
	}
	
	
	
	

	
}
}

package day52_inheritance05;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE = 610;
	public final int MODEL3_MAX_SPEED;
	public final int MODLE_X_PASSENGERS;
	public final String JAN = "January";
	
	
	public static final String COMPANY_NAME="Cybertek";
	public static final String ADMIN_USERNAME;
	
	static {
		ADMIN_USERNAME = "bojan_vasileski";
	}
	
	public FinalVariables() {
		MODEL3_MAX_SPEED = 180;
	}
	
	{
		MODLE_X_PASSENGERS=7;
	}
	
	
	
	public static void main(String[] args) {
		final int MAX_PASSENGER_COUNT = 5;
		//MAX_PASSENGER_COUNT=10;   == value of final variables cannot be changed after assignment.
		System.out.println(MAX_PASSENGER_COUNT);
		
		
		final int SSN;
		SSN=32145698;
		
		FinalVariables finalVars = new FinalVariables();
		
		System.out.println("Max range for raodster: "+finalVars.ROADSTER_MAX_RANGE);
		
		
		System.out.println("Company name: " + FinalVariables.COMPANY_NAME);
		
		
	}
}

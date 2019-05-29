package day52_inheritance05;

public class FinalArrays {
	public static void main(String[] args) {
		final int [] TEAMS = {11,11};  //in final array size cannot be change even if we assign a new object to array
		
		System.out.println("Team 1: "+TEAMS[0]);
		System.out.println("Team 2: "+TEAMS[1]);
		
		
		TEAMS[0] = 10;
		TEAMS[1] = 9;   
		
		
		

		
		
	}
}

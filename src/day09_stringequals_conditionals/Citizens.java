package day09_stringequals_conditionals;

import java.util.Scanner;

public class Citizens {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int seniorCitizens, nonSeniorCitizens, age;
	
	System.out.println("Enter current count for seniorCitizen and nonSeniorCitizen: ");
	
	seniorCitizens = scan.nextInt();
	nonSeniorCitizens = scan.nextInt();
	
	System.out.println("What is new citizen\'s age?");
	age = scan.nextInt();
	
	if(age>=65) {
		System.out.println("Senior");
		++seniorCitizens;
	}else{
		System.out.println("Non-Senior");
		++nonSeniorCitizens;
	}
	System.out.println("New seniotCitizens count " + seniorCitizens);
	System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);
	}
	

}

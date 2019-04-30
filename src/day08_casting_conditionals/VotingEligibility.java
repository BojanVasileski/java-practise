package day08_casting_conditionals;

import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		/*program to tell if you are eligable to vote 
		 * votingAge = 18
		 * yourAge= take from scanner
		 * if you can vote:
		 * You are eligable to vote.
		 * You have been eligable to vote for 3 years
		 * else
		 * you are not eligable to vote
		 * you still have 3 more years to go
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Your age:");
		int votingAge = 18;
		int yourAge = scan.nextInt() ;
		int yearsToGo = yourAge - votingAge;
		
		
		
		if (yourAge >= votingAge) {
		System.out.println("You can vote!");
		System.out.println("You have been able to vote for " + (yourAge - votingAge) + " years");
		} else {
		System.out.println("Sorry, you cannot vote.");
		System.out.println("You will be able to vote in " + (-(yourAge-votingAge)) + " years");
		}
	}
	

}

package day08_casting_conditionals;

import java.util.Scanner;

public class IfElseWithScanner {
	public static void main(String[] args) {
		//passingPercentage = 65;
		//yourScorePercentage = scanner
		//check if you passed or failed
		
		int passingPercentage = 65;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Your score:");
		
		int yourScorePercentage = scan.nextInt();
		
		if (yourScorePercentage >= passingPercentage) {
			System.out.println("Congratulations!");
		}else {
			System.out.println("Try again!");
		}
		
		System.out.println("Java is fun!");
		
		
	}
	

}

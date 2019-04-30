package day19_loopscontd;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	    Random random = new Random();
	//
	int secretNumber = random.nextInt(100);
	int i = 0;
	int guessNumber;
	do {
		
			System.out.println("Guess a number!");
			guessNumber=scan.nextInt();
			
			if(guessNumber<secretNumber) {
				System.out.println("Your number is too small");
			}else if(guessNumber>secretNumber) {
				System.out.println("Your number is too large");
				
			}
			i++;
		
	}while(i<4 && guessNumber != secretNumber);
	if(guessNumber == secretNumber) {
		System.out.println("Bingo!");
	}else {
		System.out.println("U suck at guessing :/");
	}
}
}

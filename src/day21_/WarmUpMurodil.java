package day21_;

import java.util.Scanner;

public class WarmUpMurodil {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	  
	int sum = 0;
	int sumOfSums = 0;
	do {
		System.out.println("Enter 2 numbers:");
		int num1 = scan.nextInt();
		int num2= scan.nextInt();
		sum= num1 + num2;
		sumOfSums += sum;
	}while (sumOfSums<=100);
	System.out.println("Good Numbers");
}
}

package day23;

import java.util.Scanner;

public class CalculateSum {
public static void main(String[] args) {
	//write a program that will calculate the sum of six numbers if number is less or equals to 0, ignore this number
	// we need to ask user to provide a number 
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	int num = 0;
	
	for(int i = 0; i<=5 ; i++) {
		System.out.println("Enter number:");
		num = scan.nextInt();
		if (num <=0) {
			continue;
		}else {
		sum+= num;
		}
	}
	System.out.println("Sum of numbers is " +sum);
}
}

package day11_logical_nestedif;

import java.util.Scanner;

public class TollCalculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int carType;
		boolean isRushHour;
		double price = 0.0;
		
		System.out.println("Enter Vehicle Type: 1 or 2");
		carType = scan.nextInt();
		
		System.out.println("Is it rush hour: yes | no");
		String rushHour = scan.next();
		if(rushHour.equalsIgnoreCase("yes")) {
			isRushHour= true;
		}else {
			isRushHour = false;
		}
		
		//)System.out.println(isRushHour);
		if(carType == 1) {
			if(isRushHour) {
				price = 30.0;
			}else {
				price = 5.0;
			}
		}else if(carType==2) {
			if(isRushHour) {
				price = 55.3;
			}else {
				price = 15.99; 
			}
		}
		System.out.println("Toll Cost: "+ price);
		
		//we will use logical operater and we will see how to use NESTED IF statements
		//condition1 true
		//condition2 true
	}
}

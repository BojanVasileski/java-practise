package day13_ternary_strings_introduction;

import java.util.Scanner;

public class CarSelector {
	public static void main(String[] args) {
		//1) American : Ford, Dodge, Tesla, Chevrolet, Lincoln;
		//	AveragePrice: 33000
		//2) Japanese : Toyota, Mitsubisi, Honda, Subaru, Mazda
		// 	AveragePrice: 32000
		//3)German ; BMW, Audi, Mercedes, Porsche
		//	AveragePrice: 55000
		//4) Itallian: Alfa Romeo, Ferrari, Lamborghini, Fiat
		//  AveragePrice: 85000N
		//5)Korean: Kia, Hyundai, Daewoo
		//AveragePrice = 25000
		
		Scanner scan = new Scanner(System.in);
		int carType;
		double startingPrice = 0.0;
		String carOptions = "";
		String carOrigin = "";
		System.out.println("What kind of car are you interested in?");
		System.out.println("1)American \n2)Japanese \n3)German \n4)Italian \n5)Korean");
		carType = scan.nextInt();
		switch(carType) {
		case 1:
			startingPrice=33000;
			carOptions = " Ford, Dodge, Tesla, Chevrolet, Lincoln";
			carOrigin = " American ";
			break;
		case 2:
			startingPrice=32000;
			carOptions = " Toyota, Mitsubisi, Honda, Subaru, Mazda";
			carOrigin = " Japanese ";
			break;
		case 3:
			startingPrice=55000;
			carOptions = " BMW, Audi, Mercedes, Porsche";
			carOrigin = " German ";
			break;
		case 4:
			startingPrice=85000;
			carOptions = " Alfa Romeo, Ferrari, Lamborghini, Fiat";
			carOrigin = " Italian ";
			break;
		case 5:
			startingPrice=25000;
			carOptions = " Kia, Hyundai, Daewoo";
			carOrigin = " Korean ";
			break;
			default:
				System.out.println("Car type not avaliable.");
				return;
				
		}
		
		System.out.println("You have selected" + carOrigin + "and your options are:" + carOptions);
		System.out.println("Average price: " + startingPrice);
		
		
		
	}

}

package day21_;

import java.util.Scanner;

public class Register {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Items Purchased:");
	int items = scan.nextInt();
	String name = "";
	double price = 0.0;
	String allItems = "";
	double totalPrice = 0.0; 
	
	for(int i = 1 ; i<= items; i++ ) {
		System.out.println("Item "+i+" Name:");
		name = scan.next();
		System.out.println("Item "+i+" Price:");
		price = scan.nextDouble();
		allItems+= name+", ";
		totalPrice+=price;
		
		
	}
	System.out.println("Your Items: "+ allItems.substring(0,allItems.length()-2));
	System.out.println("Total price is: $"+totalPrice);
	
	
	
	
	
}
}

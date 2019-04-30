package day19_loopscontd;

import java.util.Scanner;

public class Transactions {
public static void main(String[] args) {
	double balance = 100000;
	Scanner scan = new Scanner(System.in);
	double transaction = 0;
	int transactionCount = 0;
	System.out.println("Your balance is: " +balance+"\n");
	while(balance >0) {
		
		
			
		transactionCount++;
		System.out.println("Transaction amount?");
		transaction = scan.nextDouble();
		
		System.out.println("Succsesfull transaction count: " + transactionCount);
		if(transaction > balance) {
			System.out.println("Warning, balace is going below 0");
		}
	
		balance -= transaction;
		System.out.println("Balance :" +balance+"\n");
	}
	
	System.out.println("You have incufficent funds, your balance is: "+balance);
}
}

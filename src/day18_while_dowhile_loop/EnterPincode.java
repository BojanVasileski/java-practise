package day18_while_dowhile_loop;

import java.util.Scanner;

public class EnterPincode {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	 int secretPincode = 1234;
	 
	 int pincode = 0;
	 //keep asking for pincode untill user enteres coreect one;
	 
	 while(pincode != secretPincode) {
		 System.out.println("Enter pincode:");
		 pincode = scan.nextInt();
		 
	 }
	 
	 System.out.println("User Logged In!");
}
}

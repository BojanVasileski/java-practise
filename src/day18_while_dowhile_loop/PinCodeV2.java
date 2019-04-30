package day18_while_dowhile_loop;

import java.util.Scanner;

public class PinCodeV2 {
public static void main(String[] args) throws InterruptedException {
	Scanner scan = new Scanner(System.in);
	
	int secretPincode = 4321;
	//give only 3 attempts
	//if attempts reacher over 3 pritn card blocker
	
	int pincode = 0;
	int attempts = 0;
	
	while(pincode != secretPincode)  {
		System.out.println("Enter pin code:");
		pincode = scan.nextInt();
		
		attempts++;
		Thread.sleep(444);
		if(attempts == 3 && pincode != secretPincode) {
			System.out.println("Card is blocked!");
			return;
		}
	
	}
	

	System.out.println("access granted. Select operation");
	
	
	
}
}

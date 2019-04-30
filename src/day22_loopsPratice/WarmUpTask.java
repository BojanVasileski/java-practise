package day22_loopsPratice;

import java.util.Scanner;

public class WarmUpTask {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int month;
	
	/*valid months : 1.2.3.4.5.6.7..9.10.11.12
	 * Loop 
	 * Enter Month: 
	 * 
	 */
	
	
	do {
		System.out.println("Enter Month:");
		month = scan.nextInt();
	}while(month<=12 && month >0);
	System.out.println("Invalid Month - " + month);
	
}
}

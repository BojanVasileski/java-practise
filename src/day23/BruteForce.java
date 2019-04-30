package day23;

import java.util.Scanner;

	public class BruteForce {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String expectedUsername= "admin";
		String expectedPassword = "admin123";
		String username = "";
		String password = "";
		int attempts = 3;
		
		
		do {
			
			if(attempts--==0) {
				System.out.println("You have exceded number of attemts");
				return;
			}
			System.out.println("Enter Username");
			username = scan.next();
			
			System.out.println("Enter password");
			password = scan.next();
			if(!username.equals(expectedUsername) || !password.equals(expectedPassword)) {
				System.out.println("Wrong Username");
				System.out.println("Attempts left "+attempts);
				continue;
			}
		}while(!username.equals(expectedUsername) || !password.equals(expectedPassword));
		
		System.out.println("Login Succesfull");
		
		
	}
	}
	

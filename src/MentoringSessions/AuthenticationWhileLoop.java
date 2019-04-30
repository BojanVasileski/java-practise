package MentoringSessions;

import java.util.Scanner;

public class AuthenticationWhileLoop {
public static void main(String[] args) {
	//Create a program that will check user log in credentials (username and password) 
	
	Scanner scan = new Scanner(System.in);
	
	String validUsername = "bojan_vasileski";
	String vaildPassword = "iLoveJava$$$";
	
	String username = "";
	String password = "";
	
	while(!username.equals(validUsername)&&!password.equals(vaildPassword)) {
		System.out.println("Username:");
		username= scan.next();
		
		System.out.println("Password");
		password = scan.next();
	}
	
	System.out.println("Login Succesfull!");
	
	
	
}
}

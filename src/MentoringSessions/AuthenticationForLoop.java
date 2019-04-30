package MentoringSessions;

import java.util.Scanner;

public class AuthenticationForLoop {
public static void main(String[] args) {
	//Create a program that will check user log in credentials (username and password) and if user fails to 
	//provide valid data the user gets locked out
			Scanner scan = new Scanner(System.in);
			
			String validUsername = "bojan_vasileski";
			String vaildPassword = "iLoveJava$$$";
			
			String username = "";
			String password = "";
			
			for(int i = 1;i<=5;i++) {
				System.out.println("Username:");
				username= scan.next();
				
				System.out.println("Password");
				password = scan.next();
				if(username.equals(validUsername)&&password.equals(vaildPassword)) {
					System.out.println("Login Succesfull");
					System.exit(0);
				}
			}
			System.out.println("User Locked Out!");
}
}

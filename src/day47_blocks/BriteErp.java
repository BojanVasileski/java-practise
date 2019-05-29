package day47_blocks;

import java.time.LocalDateTime;

public class BriteErp {
	static{
		System.out.println("Launch Browser");
		System.out.println("Navigate to: "+MainTestData.url);
		
		}
	
	public static void enterEmail() {
		System.out.println("Enter email: "+MainTestData.email);
	}
	public static void enterPassword() {
		System.out.println("Enter Password: "+ MainTestData.password);
	}
	public static void verifyLogin() {
		System.out.println("Expected Name: "+MainTestData.username);
		System.out.println("Actual name displayed: username");
		System.out.println("Login Succesfull: "+LocalDateTime.now());
	}
}

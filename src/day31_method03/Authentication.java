package day31_method03;

import java.util.Scanner;

public class Authentication {
public static void main(String[] args) {
	
	login("","");
	
}

public static void login(String userName, String passWord) {
	Scanner scan = new Scanner(System.in);
	String vaildUsername = "mentoring@cybertekschool.com";
	String calidPassword = "mentor001";
	
	System.out.println("Enter Username:");
	userName = scan.next();
	

	System.out.println("Enter Password:");
	passWord = scan.next();
	if(userName.equalsIgnoreCase(vaildUsername) && passWord.equals(calidPassword)) {
	System.out.println("Login Succsessful! Welcome to Okta");
	}else {
	System.out.println("Invalid Input");
	}
}

public static void passWord() {
	
}
}

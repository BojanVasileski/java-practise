package day11_logical_nestedif;

import java.util.Scanner;

public class LogInTests {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String vaildUsername = "cybertek@mail.com";
		String vaildPassword = "WoodenSpoon123";
		
		System.out.println("username");
		String username = scan.next();
		System.out.println("password");
		String password = scan.next();
		
		if(username.equalsIgnoreCase(vaildUsername)&&password.equals(vaildPassword)) {
			System.out.println("Login Succesful, Welcome!");
		}else if(!username.equalsIgnoreCase(vaildUsername)&&!password.equals(vaildPassword)) {    //!username.equalsIgnoreCase(vaildUsername)
			System.out.println("Invalid Username and Invalid Password");
		}else if (username.equalsIgnoreCase(vaildUsername)&&!password.equals(vaildPassword)) {
			System.out.println("Invalid Password");
		}else if(username!=vaildUsername&&password.equals(vaildPassword)) {
			System.out.println("Invalid Username");
		}
			
	}
}

package day16_string_manipulation;

public class IsEmpty {
public static void main(String[] args) {
	String userName = "";
	String password = "sdaa";
	System.out.println(userName.isEmpty());
	
	
	if(userName.isEmpty()) {
		System.out.println("Username field cannot be empty");
	}else {
		System.out.println("Username is not empty");
	}
	
	if(userName.isEmpty() || password.isEmpty()) {
		System.out.println("Username or password cannot be empty");
	}else {
		System.out.println("Username or password is not empty");
	}
	
	if (userName.length() == 0) {
		System.out.println("Lenght is 0");
	}
	
	
}
}

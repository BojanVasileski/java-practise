package day45_encaptulation_practice;

import java.util.Random;

public class EtsyAccount {
private String email;
private String firstName;
private String password;

public EtsyAccount() {
	email = "";
	firstName ="";
	password = "";
}
public EtsyAccount(String email, String firstName,String password) {
	setEmail(email);
	setFirstName(firstName);
	setPassword(password);
	}
public EtsyAccount(String email,String firstName) {
	setEmail(email);
	setFirstName(firstName);
	this.password = getRandomPassword();
}
private String getRandomPassword() {
	Random rand = new Random();
	String letter = "abcdefghijklmnopquarsuvwxyz1234567890";
	String rdPassword = "";
	for(int i = 1;i<=6;i++) {
		rdPassword += letter.charAt(rand.nextInt(letter.length()));
	}
	return rdPassword;
}

public String toString() {
	return "EtsyAccount [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	if(email.contains("@")&& !email.substring(email.length()-1).equals("@")&&!email.substring(0,1).equals("@")){
		this.email = email;
	}else {
		System.out.println("Please enter a valid email address!");
	}
	
}
public String getFirstName() {
	
	return firstName;
}
public void setFirstName(String firstName) {
	if(isValiedFirstName(firstName)) {
	this.firstName = firstName;
	}

}
private boolean isValiedFirstName(String firstName) {
	if(firstName.isBlank()) {
		System.out.println("Cannot be blank");
	}
	if(firstName.startsWith(" ")|| firstName.endsWith(" ")) {
		return false;
	}
	for(int i = 0;i<firstName.length();i++) {
		if(!Character.isAlphabetic(firstName.charAt(i))&& firstName.charAt(i)!=' ') {
			return false;
		}
		}
	return true;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	if(password.length()<6) {
		System.out.println("Must be at least 6 characters.");
		return;
	}
	this.password = password;
} 



}

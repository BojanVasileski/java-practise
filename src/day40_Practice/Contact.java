package day40_Practice;

public class Contact {
	String name;
	String phoneNumber;
	String email;
	
	public void call() {
		System.out.println("Calling " + name + ".......");
	}
	
	public void sendMessage() {
		System.out.println("Sending Message to "+name+ " - "+ phoneNumber+ "........");
	}

	public void sendEmail() {
		System.out.println("Sending Email to: "+ name + " - " + email + "........");
	}
	
}	

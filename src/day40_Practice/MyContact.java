package day40_Practice;

public class MyContact {
	public static void main(String[] args) {
		//create contact object
		Contact contact1 = new Contact();
		contact1.name = "Bojan";
		contact1.email = "bojan.vasileski@yahoo.com";
		contact1.phoneNumber = "804-386-4950";
		
		contact1.call();
		contact1.sendMessage();
		contact1.sendEmail();
		
		Contact orhan = new Contact();
		
		orhan.name = "Orhan Soultanov";
		orhan.phoneNumber = "523-4123-123";
		orhan.email = "orhan.s@hello.com";
		
		orhan.call();
		orhan.sendEmail();
		orhan.sendMessage();
		
	}
}

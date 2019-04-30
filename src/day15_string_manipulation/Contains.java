
package day15_string_manipulation;

public class Contains {
public static void main(String[] args) {
	String email = "test@gmail.com";
	
	System.out.println(email.contains("@"));
	
	String list = "potatoes, apples, tomatoes, eggs, milk, bread, cereal, meat";
	System.out.println(list.contains("apple"));
	
	if(list.contains("apples")) {
		System.out.println("Apples are there");
	}else {
		System.out.println("Lets add apples now");
	}
	
	
	boolean hasEggs = list.contains("eggs");
	System.out.println("Contains eggs: "+ hasEggs);
	
	boolean hasCucumbers = list.toLowerCase().contains("cucumbers");
	System.out.println("Contais cucumbers: "+hasCucumbers);
	
	email = "name@yahoo.com";
	if(email.contains("@yahoo")) {
		System.out.println("Yahoo acoount");
	}else if(email.contains("gmail")) {
		System.out.println("Gmail account");
	}
	
	String etsyTitle = "Wooden spoon | Etsy";
	
	if(etsyTitle.contains(" | ")) {
		System.out.println("Pipe is there as expected");
	}else {
		System.out.println("Pipe is not detected");
	}
	
	String name = "Bojan Vasileski";
			
			if(name.contains("e") || name.contains("a")) {
				System.out.println("Name contains e or a.");
			}else {
				System.out.println("Name doesn\'t contains e or a.");
			}
	
	
	
}
}

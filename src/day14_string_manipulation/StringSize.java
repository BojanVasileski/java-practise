
package day14_string_manipulation;

public class StringSize {
	public static void main(String[] args) {
		String str1 = "Good Morning";
		System.out.println(str1.length());
		//check if it nmatches Good morning
		if(str1.equals("Good Morning")){
			System.out.println("Match");
		}else {
			System.out.println("Not Match");
		}
		
		if(str1.equalsIgnoreCase("good morning")) {
			System.out.println( "Match - ignore case");
		}else {
			System.out.println("Not Match - ignore case");
		}
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		
		str1 = str1.toUpperCase();
		
		System.out.println(str1);
		if(str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("Chained methods: do not match");
		}
		str1  = str1.toLowerCase();
		System.out.println(str1);
		
		String myName = "Bojan";
		System.out.println(myName.length());
		
		int lenght = myName.length();
		System.out.println("My name's length:" + lenght);
		
		//usernames must be exactly 8 characters.
		
		String userName= "Bojavas";
				if(userName.length()==8) {
					System.out.println("valid username");
				}else {
					System.out.println("invalid username");
				}
		String password = "vasboj";		
				if (password.length()>=6) {
					System.out.println("Password is good");
				}else {
					System.out.println("Password is too short");
				}
				
				int passwordLength = password.length();
				
				if (passwordLength< 6) {
					System.out.println("invalid password. too short");
				}else {
					System.out.println("valid password good job");
				}
		
		
		
		
		
	}
}

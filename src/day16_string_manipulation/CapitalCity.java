package day16_string_manipulation;

public class CapitalCity {
	public static void main(String[] args) {
		String str = "Skopje is the capital of North Macedonia";
		//Moscow, Russia
		System.out.println(str);
		str= str.replace("Skopje", "Moscow").replace("North Macedonia","Russia");
		System.out.println(str);
		
		String email = "bojan_vasileski@gmail.com";
		
		String company = "deloitte";
		
		String newEmail = email.replace("gmail", company);
		System.out.println(email);
		System.out.println(newEmail);
	}


}

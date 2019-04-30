package day4_primitives_operators;

public class StringConcat {
	public static void main(String[] args) {
		//String variable called firstName and assign first name
		
		String firstName = "Bojan";
		System.out.println("My name is " +firstName);
		
		String city = "Skopje";
		System.out.println("I was born in " + city);
		
		String job = "SDET";
		String company = "LabCom";
		
		System.out.println("I work as " + job + " in " + company);
		
		int zipcode = 23225;
		
		System.out.println("I live in " + zipcode + " zipcode");
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + "" + num2);
		System.out.println(num1 + num2);
	}

}

package day4_primitives_operators;

public class AgeCalculator {
	public static void main(String[] args) {
		int yearOfBirth = 1993;
		int currentYear = 2019;
		int age = currentYear - yearOfBirth;
		
		System.out.println("If you are born in " + yearOfBirth + " then you are " + age + " years old");
}
}

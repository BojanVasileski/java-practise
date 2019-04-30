package day5_math_operators;

public class CompanyWarmUp {
	public static void main(String[] args) {
		int numberOfEmployees = 10000;
		long revenue = 4000000l;
		boolean isTechCompany = true;
		String companyName = "Facebook";
		String address = "Silicon Valley, CA";
		String aboutCompany = companyName + " is a company that is stationed in " + address + " and " + 
		numberOfEmployees + " people are employed there. \nIt\'s revenue is " + revenue + " and it is a tech company";
		
		System.out.println("Company \nname is " + companyName);
		System.out.println("Company address is " + address);
		System.out.println("Company has " + numberOfEmployees + " employees");
		System.out.println("Company has revenue of " + revenue);
		System.out.println("Is this a tech company? " + isTechCompany);
		System.out.println(aboutCompany);
		
		
	}

}

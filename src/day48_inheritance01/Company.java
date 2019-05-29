package day48_inheritance01;

public class Company {
	public static void main(String[] args) {
		Empoyee emp1 = new Empoyee();
		   emp1.name = "Marufjon";
		   emp1.jobTitle = "teacher";
		   emp1.gender = 'm';
		   emp1.age = 22;
		   Empoyee emp2 = new Empoyee();
		   emp2.name = "kiki";
		   emp2.age = 26;
		   emp2.gender = 'f';
		   emp2.jobTitle = "HR";
		   
		   emp1.work();
		   emp2.work();
		   
		   emp1.eat("chicken kesadia");
		   emp2.eat("salad");
		   
		   emp1.walk();
		   emp2.walk();
		   emp1.sleep(5);
		   emp2.sleep(8);
		   System.out.println(emp2.toString());
	}
}

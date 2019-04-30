package day7;

public class EnoughPizza {
	public static void main(String[] args) {
		
		int pizzaCount = 40;
		int studentsCount = 145;

		
				
		boolean inEnoughPizza = pizzaCount * 8 >= studentsCount * 2;
		
		System.out.println(inEnoughPizza);
		
	}

}

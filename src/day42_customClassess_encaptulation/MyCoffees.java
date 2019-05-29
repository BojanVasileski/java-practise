package day42_customClassess_encaptulation;

public class MyCoffees {
	public static void main(String[] args) {
		Coffee coffee1 = new Coffee();
		
		coffee1.name="Machiatto";
		coffee1.size = "GRANDE";
		coffee1.price=4.75;
		coffee1.calories=250;
		
		coffee1.getCoffeeInfo();
		
		Coffee coffee2 = new Coffee();
		
		coffee2.setName("Java Chip");
		coffee2.size = "VENTI";
		coffee2.price = 5.95;
		coffee2.calories = 600;
		System.out.println("***********************************************");
		coffee2.getCoffeeInfo();
		
		Coffee coffee3 = new Coffee();
		
		coffee3.setName("Iced Coffee");
		coffee3.setSize("TALL");
		coffee3.setPrace(2.45);
		coffee3.setCal(60);
		
		System.out.println("coffee3 name: "+coffee3.name);
		System.out.println("*******************************************************");
		coffee3.getCoffeeInfo();
		
		System.out.println("*******************************************************");

		Coffee coffee4 = new Coffee();
		coffee4.setCoffeeInfo("FLAT WHITE", "TALL", 3.95, 170);
		coffee4.getCoffeeInfo();
	}
}

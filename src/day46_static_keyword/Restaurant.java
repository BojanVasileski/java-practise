package day46_static_keyword;

public class Restaurant {
	public static void main(String[] args) {
		
	
	Dinner mom = new Dinner();
	Dinner dad = new Dinner();
	Dinner kid = new Dinner();
	
	System.out.println("total slices " +Dinner.pizzaSlices);
	
	kid.takeASlice();
	System.out.println("total slices " +kid.pizzaSlices);
	mom.takeASlice(7);
	System.out.println("total slices " +kid.pizzaSlices);
	kid.takeASlice();
	System.out.println("total slices " +kid.pizzaSlices);
	//System.out.println("total slices " +kid.pizzaSlices);
	kid.takeASlice();
	System.out.println("total slices " +kid.pizzaSlices);
	}
	
	
}


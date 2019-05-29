package day46_static_keyword;

public class Dinner {
	public static int pizzaSlices=8;
	
	public void takeASlice() {
		if(pizzaSlices<1) {
			System.out.println("no mas pizza");
			return;
		}
		pizzaSlices--;
	}
	
	public void takeASlice(int count) {
		if(pizzaSlices<1) {
			System.out.println("no mas pizza");
			return;
		}
		pizzaSlices-=count;
	}
}

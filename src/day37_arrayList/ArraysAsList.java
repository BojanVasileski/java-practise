package day37_arrayList;
import java.util.*;
public class ArraysAsList {
	public static void main(String[] args) {
		//declare and add values in a single statement , when this is done size cannot be change, list cannot be modified at all
		List<String> cars = Arrays.asList("Tesla", "Porche", "Lexus", "Honda");
		
		System.out.println(cars.size());
		System.out.println(cars);
		
		//create arraylist prices
		//assign values using arrays as list method
		
		List<Double> prices = Arrays.asList(9.99 ,12.8 ,10.3 ,100.1 ,101.1 ,111.1 ,5.4 ,33.3 ,13.3 ,9.99);
		
		System.out.println(prices);
		
		double sum = 0;
		
		for(Double price:prices) {
			sum+=price;
		}
		System.out.println("Total price: " +sum);
		
		double sum2 =0;
		for(int i = 0; i< prices.size();i++) {
			sum2+=prices.get(i);
		}
		System.out.println("Total price: " +sum);
		
		
		List<Double> expensive = new ArrayList<>();
		
		for(Double price:prices) {
			if(price> 100) {
				expensive.add(price);
			}
		}
		System.out.println(expensive);
		
	}
}

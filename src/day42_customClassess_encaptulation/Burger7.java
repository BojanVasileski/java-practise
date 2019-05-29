package day42_customClassess_encaptulation;
import java.util.*;
public class Burger7 {
public static void main(String[] args) {
	Burger burger1 = new Burger();
	
	burger1.name = "COWBOY";
	
	String[] ings = {"onion crisp", "american cheese", "pickles","lettuce","bb7 sauce"}; 
	burger1.ingredients = ings;
	System.out.println(burger1.name);
	System.out.println(Arrays.toString(burger1.ingredients));
	System.out.println("***********************************************");
	
	for(String ing :burger1.ingredients) {
		System.out.println(ing);
	}
	
}
}

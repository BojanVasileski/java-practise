package day42_customClassess_encaptulation;
import java.util.*;
public class Strabucks {
	public static void main(String[] args) {   //object Arrays = create manipulate
		//declare an array thtat can store 2 coffee objects
		Coffee[] twoCoffee = new Coffee[2];
		twoCoffee[0] = new Coffee();
		twoCoffee[0].setCoffeeInfo("Espresso", "TALL", 2.55 , 7);
		twoCoffee[0].getCoffeeInfo();
		
		Coffee tursko = new Coffee();
		tursko.setCoffeeInfo("Tursko", "Standard", 0.99, 10);
		twoCoffee[1] = tursko;
		twoCoffee[1].getCoffeeInfo();
		
	}
}

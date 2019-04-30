package day32_costumMethods;

public class Cooking {
public static void main(String[] args) {
	pancakes();
	pasta();
	pancakes();
	System.out.println();
	cook("Omlette","eggs, salt, tomatoes, green peppers, onions");
}

public static void cook(String dish, String ingredients) {
	System.out.println("~~"+ dish.toUpperCase()+" "+" RECIPE~~");
	add(ingredients);
	System.out.println("Cook it untill its cooked");
	System.out.println("~~"+dish.toUpperCase()+" IS READY~~");
}



public static void pasta() {
	System.out.println("~~ ITALLIAN PASTA RECIPE ~~");
	add("water, salt, olive oil");
	boil(2);
	add("Splagetti Pasta");
	boil(9);
	mix(60);
	add("parmesan, marinara");
	System.out.println("~~ DELICIOUS PASTA IS READY");
}
public static void pancakes() {
	System.out.println("~~ ENJOY YOUR DELICIOUS PANCAKES ~~");
	add("eggs, milk, flour, sugar, salt");
	mix(120);
	fry(3);
	
}

public static void add(String ingredients) {
	System.out.println("Add : "+ ingredients);
}
public static void mix(int seconds) {
	System.out.println("Mix for: "+seconds+" seconds");
}
public static void fry(int minutes) {
	System.out.println("Fry for: "+minutes+" minutes");
}
public static void boil(int minutes) {
	System.out.println("Boil for: "+minutes+" minutes");
}
}

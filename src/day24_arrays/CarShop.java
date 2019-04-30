package day24_arrays;

import java.util.Arrays;

public class CarShop {
public static void main(String[] args) {
	// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
	// 1. create a array of string and store these cars inside the array
	
	String [] cars = {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
	
	
	//print car names that start with m
	
	for(String car:cars) {
		if(car.startsWith("M")) {
			System.out.println(car);
		}else {
			continue;
		}
	}
	
	//print all cars that have letter r somwhere in the name
	//make your search case insensitive
	System.out.println("********************************************");
	for(String car:cars) {
		if(car.toLowerCase().contains("r")) {
			System.out.println(car);
		}else {
			continue;
		}
	}
	
	System.out.println("********************************************");
	
	//print car name that ends wiht "a"
	
	for(String car:cars) {
		if(car.endsWith("a")) {
			System.out.println(car);
		}else {
			continue;
		}
	}
	System.out.println("********************************************");

	///print all cars that have at lest 6 letters in the name
	
	for(String car:cars) {
		if(car.length()>=6) {
			System.out.println(car);
		}else {
			continue;
		}
	}
	System.out.println("********************************************");
	//swap first and last value in the array
	
	String temp = cars[0];
	cars[0]= cars[cars.length-1];
	cars[cars.length-1] = temp;
	
	System.out.println(Arrays.toString(cars));
	
	System.out.println("********************************************");
	
	
	
	
}
}

package day29_method01;

import java.util.Arrays;

public class Countries {
public static void main(String[] args) {
	String[][] countriesArrays = {{"USA","Washington DC"},
			{"Canada","Ottawa"},
			{"Mexico","Mexico city"},
			{"Brasil","Brasilia"},
			{"Peru","Washington DC"},
			{"Argentina","Lima"},
			{"Bolivia","La Paz"},
			{"Macedonia","Scopia"},
			{"Kazakhstan","Nursultan"},
								 			  		
			
	};
	System.out.println(Arrays.deepToString(countriesArrays[0]));
	
	System.out.println(countriesArrays[7][0]+"|"+countriesArrays[7][1]);
	System.out.println("*****************************************************************************************");
	//print out countries
	for(int i =0;i<countriesArrays.length;i++) {
		System.out.print(countriesArrays[i][0]+"|");
	}
	System.out.println();
	System.out.println("*****************************************************************************************");
	//print out cities
	for(int i =0;i<countriesArrays.length;i++) {
		System.out.print(countriesArrays[i][1]+"|");
	}
	System.out.println();
	System.out.println("*****************************************************************************************");
	//print out cities
	for(int i =0;i<countriesArrays.length;i++) {
		System.out.print(Arrays.deepToString(countriesArrays[i])+"|");
	}
	System.out.println();
	System.out.println("*****************************************************************************************");
	//print countries with FOR EACH LOOP
	for(String[] country:countriesArrays) {
		System.out.print(country[0]+"|");
	}
	System.out.println();
	System.out.println("*****************************************************************************************");
	//print cities with FOR EACH LOOP
	for(String[] city:countriesArrays) {
		System.out.print(city[1]+"|");
	}
	System.out.println();
	System.out.println("*****************************************************************************************");
	//get all the cities and add to cities array
	
	String[] cities = new String [countriesArrays.length];
	System.out.println(Arrays.toString(cities));
	
	for(int i = 0;i<countriesArrays.length;i++) {
		cities[i] = countriesArrays[i][1];             //assign value to an array
	}
	
	System.out.println(Arrays.toString(cities));
	System.out.println("*****************************************************************************************");
	//look for bolivia in the countries arr and test if capital city is la paz
	
	for(int i = 0;i<countriesArrays.length;i++) {
		if(countriesArrays[i][0].equals("Bolivia")) {
			if(countriesArrays[i][1].equals("La Paz")) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
			break;
		}
	}
	
	
	
	
	
	
	
	
}
}

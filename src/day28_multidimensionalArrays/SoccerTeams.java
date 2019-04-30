package day28_multidimensionalArrays;

import java.util.Arrays;

public class SoccerTeams {
public static void main(String[] args) {
	//declare multidimentional arrays with 2 rows and 6 columns
	String[][] teams = new String [2][6];
	teams[0][0] = "Irina";
	teams[0][1] = "Zarif";
	teams[0][2] = "Cihan";
	teams[0][3] = "Habib";
	teams[0][4] = "Adel";
	teams[0][5] = "Bojan";
	
	teams[1][0] = "Olimjon";
	teams[1][1] = "Mirshod";
	teams[1][2] = "Usman";
	teams[1][3] = "Nursultan";
	teams[1][4] = "Roman";
	teams[1][5] = "Dimitry";
	
	System.out.println("First player of first team: ");
	System.out.println(teams[0][0]);
	System.out.println(teams[0][3]);
	System.out.println(teams[0][5]);
	System.out.println(teams[1][5]);
	
	System.out.println("People in first team "+teams[0].length);
	System.out.println("People in second team "+teams[1].length);
	
	System.out.println(Arrays.deepToString(teams));
	
	int [][] cities = new int [3][4];
	
	cities [0][0] = 100;
	cities [0][1] = 500;
	cities [0][2] = 2343;
	cities [0][3] = 100;
	
	cities [1][0] = 1001;
	cities [1][1] = 5230;
	cities [1][2] = 23343;
	cities [1][3] = 10210;
	
	cities [2][0] = 1300;
	cities [2][1] = 5040;
	cities [2][2] = 9343;
	cities [2][3] = 1090;
	
	System.out.println(Arrays.deepToString(cities));
	System.out.println(Arrays.toString(cities[0]));
	
	
	int [][]scores = {{3,5,10},{6,4,2,10}};
	
	System.out.println("Days played/Number of Arrays: "+ scores.length);
	System.out.println("Number of vaules in 1: "+ scores[0].length);
	System.out.println("Number of vaules in 1: "+ scores[1].length);
	
	int [][] values = new int [4][];
	values [0] = new int [] {34,23,5};
	values [1] = new int [] {34,25,534,87,95456,56,7,23,5};
	
	values [2] = new int [2];
	values [2][0] = 55;
	values [2][1] = 555;
	
	values [3]= new int[] {5,12,45,77,43};
	
	
	System.out.println(Arrays.deepToString(values));
	
	
	
	
	
}
}

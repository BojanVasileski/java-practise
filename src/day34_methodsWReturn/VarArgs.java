package day34_methodsWReturn;

import java.util.Arrays;

public class VarArgs {
	public static void main(String[] args) {
		printWords("red","blue","yellow");
		
		System.out.println("******************************************************************");
		System.out.println(sum(1,2,3,4,5,6,7,8,9));
		
		System.out.println("******************************************************************");
		cook("Avocado Toast", "Avocado","Wheat Toast","Sunny Side Eggs");
		System.out.println("******************************************************************");
		shoppingList(1000,"Skagen","Tesla","Patika");
		System.out.println("******************************************************************");
		String [] myPets = {"cat","horse","dog","sheep","goat"};
		printWords(myPets);
	}
	
	public static void printWords(String... words) {
		for(String word:words) {
			System.out.println(word);
		}
	}
	public static int sum(int...nums) {
		int sum = 0;
		for(int n:nums) {
			sum += n;
		}
		return sum;
	}
	public static void cook(String name, String...ings) {
		System.out.println("Food: "+name);
		System.out.println(Arrays.toString(ings));
	}
	public static void shoppingList(int totalPrice,String... ings) {
		System.out.println("Total Price is "+totalPrice);
		System.out.println(Arrays.toString(ings));
	}

}

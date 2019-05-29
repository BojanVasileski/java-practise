package day37_arrayList;

import java.util.ArrayList;


public class Shopping {
public static void main(String[] args) {
	ArrayList<String> shoppingList = new ArrayList<>();
	
	shoppingList.add("banana");
	shoppingList.add("mango");
	shoppingList.add("kiwi");
	shoppingList.add("baklava");
	shoppingList.add("kefir");
	shoppingList.add("plantane");
	
	System.out.println(shoppingList.size());
	
	//print all items in a single line
	int count = shoppingList.size();
	System.out.println(shoppingList.toString());
	
	//print first and last item in a single line
	System.out.println(shoppingList.get(0)+" | "+ shoppingList.get(count-1));
	
	//remove from arraylist
	
	shoppingList.remove("kiwi");
	System.out.println(shoppingList);
	System.out.println(shoppingList.get(0));
	
	for(String item:shoppingList) {
		System.out.println(item);
	}
	
	//remove all items at once
	shoppingList.clear();
	
	
}
}

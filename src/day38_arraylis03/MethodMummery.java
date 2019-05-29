package day38_arraylis03;
import java.util.*;
public class MethodMummery {
public static void main(String[] args) {
	List<String> list1 = new ArrayList<>();
	list1.add("red");
	list1.add("blue");
	list1.add("white");
	list1.add("gray");
	list1.add("black");
	//add method with index: yellow will be placed at index one and red is gonna be pushed by one to the right
	list1.add(0,"yellow");
	//toString() method to print all values in same line
	System.out.println(list1.toString());
	//size method
	System.out.println("Number of elements in list: "+ list1.size());
	//get method, return value from index
	System.out.println("Index 3 is: "+list1.get(3));
	//remove using index. removes value from index
	list1.remove(0);
	System.out.println(list1);
	//remove using value/element. removes elements first occurance
	list1.remove("blue");
	System.out.println(list1);
	//set(Index, value)) replace certain index with new value
	list1.set(0, "orange");
	System.out.println(list1);
	//indexOf(value). returns index of value in the list
	System.out.println("gray is: "+list1.indexOf("gray"));
	//isEmpty(). check if a list is empty and returns true or false
	System.out.println("Is list empty? "+list1.isEmpty());
	//contains(). check if value is in list and returns boolean
	System.out.println("Does list contain Bojan? "+list1.contains("Bojan"));
	
	List<String> list2 = new ArrayList<>();
	//addAll(). adds all values from one list into another 
	list2.addAll(list1);
	System.out.println(list2);
	//containsAll(). checks if list has all values of another list
	System.out.println("containsAll: "+ list1.containsAll(list2));
	//equals() checks if two lists are exactly equal
	System.out.println("equals: "+ list1.equals(list2));
	list2.add("pink");
	//removeAll(). removes all matcing values from your list that are in other list
	list2.removeAll(list1);
	System.out.println("list2 after removeAll: " + list2);
	System.out.println("list1: " + list1);
	
	//addAll(index,list) adds a new list values starting from given indexx
	list2.addAll(0,list1);
	System.out.println("list2 after list2.addAll(0,list1); "+list2);
	//clear and isEmpty
	list1.clear();
	list2.clear();
	System.out.println("both lists empty? "+(list1.isEmpty() && list2.isEmpty()));
	
	
	
	


}
}

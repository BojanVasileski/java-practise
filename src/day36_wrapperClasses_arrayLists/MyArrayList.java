package day36_wrapperClasses_arrayLists;
import java.util.ArrayList;

public class MyArrayList {
	public static void main(String[] args) {
		//Create array list
		String [] str = new String[5];
		ArrayList<String> names = new ArrayList<>();
		
		int[] numsArray = new int[5];
		ArrayList<Integer> nums = new ArrayList<>();
		
		
		//assign values into arraylist
		
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		names.add("Maria");
		
		nums.add(100);
		nums.add(99);
		nums.add(656);
		nums.add(555);
		
		//read from ArrayList
		System.out.println(names.get(0));
		
		//number of elements in arrayslist
		
		nums.size();
		names.size();
		
	}
}

package day36_wrapperClasses_arrayLists;
import java.util.*;
public class ArrayListExample {
	public static void main(String[] args) {
		//declare arraylist called langiages
		ArrayList<String> languages = new ArrayList<>();
		
		//add values
		languages.add("Java");
		languages.add("English");
		languages.add("Spanish");
		languages.add("French");
		
		//remover java
		languages.remove(0);
		
		
	}
}

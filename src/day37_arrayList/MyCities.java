package day37_arrayList;
import java.util.*;
public class MyCities {
	public static void main(String[] args) {
		ArrayList<String> cities= new ArrayList<>();
		
		cities.add("Barnaul");
		cities.add("Sterling");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("Dushanbe");
		cities.add("Baku");
		
		for(String city:cities) {
			System.out.print(city+" ");
		}
		
		System.out.println();
		cities.remove("Baku");
		for(int i = 0; i< cities.size();i++) {
			System.out.print(cities.get(i)+" ");
		}
		System.out.println();
		cities.add(1,"Istanbul");
		System.out.println(cities);
		
		cities.set(2, "Seoul");
		System.out.println(cities.toString());
		
		int idx = cities.indexOf("Seoul");
		System.out.println(idx);
		cities.set(idx, "Zagreb");
		System.out.println(cities.toString());
		
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println(empty);
		
		
		
	}
}

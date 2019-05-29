package day38_arraylis03;
import java.util.*;
public class ContainsMethod {
	public static void main(String[] args) {
		ArrayList <String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());
		ArrayList<String> list2 = list1; 		//if list1 changes than list 2 changes as well
		
		ArrayList <String> months = new ArrayList<>(list1);		
		System.out.println(months.toString());
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		
		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		//how would you check if february is in second position
		
		System.out.println(months.indexOf("Feb")==1);  //find index and see if equals index  /
		System.out.println(months.get(1).equals("Feb")); //get value and compare
		
		ArrayList<String> month2 = new ArrayList<>(list1);
		System.out.println("Month: "+ months.toString());
		System.out.println("Month2: "+ month2.toString());
		
		if(months.containsAll(month2)) {
			System.out.println("Month has all values from month2");
		}else {
			System.out.println("Month is missing values from month2");
		}
		
		
		//add jan to month2
		month2.add("Jan");
		if(months.containsAll(month2)) {
			System.out.println("Month has all values from month2");
		}else {
			System.out.println("Month is missing values from month2");
		}
		
	}
}

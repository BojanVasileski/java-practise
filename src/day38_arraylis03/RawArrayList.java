package day38_arraylis03;
import java.util.*;

public class RawArrayList {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();  //raw type array list
		list.add("Saturday");
		list.add("Java day");
		list.add(3);
		list.add(3.33);
		list.add(true);
		list.add(false);
		
		System.out.println(list);  //automatically calls toString.
		
		String allValues = list.toString();  //when assigning arraylist we have to use toString()
		
		String str = list.get(0).toString();
	}
}

package day37_arrayList;

import java.util.ArrayList;

public class RemoveInteger {
public static void main(String[] args) {
	ArrayList<Integer> nums = new ArrayList<>();
	System.out.println(nums.size());
	System.out.println(nums.isEmpty());
	
	nums.add(1);
	nums.add(5);
	nums.add(333);
	nums.add(555);
	nums.add(777);
	nums.add(999);
	nums.add(55);
	
	Integer n1 = new Integer(5);
	Integer n2 = Integer.valueOf(5);
	
	nums.remove(n1);
	
	System.out.println(nums.toString());
}
}

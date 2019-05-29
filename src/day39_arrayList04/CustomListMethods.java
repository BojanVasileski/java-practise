package day39_arrayList04;
import java.util.*;
public class CustomListMethods {
public static void main(String[] args) {
	ArrayList<Integer> nums = new ArrayList<>();
	nums.add(10);nums.add(10);nums.add(7);nums.add(8);
	nums.add(8);nums.add(3);nums.add(4);nums.add(8);
	
	List<Double> nums1 = new ArrayList<>();
	nums1.add(10.1);nums1.add(10.1);nums1.add(7.1);nums1.add(8.1);
	nums1.add(8.1);nums1.add(3.1);nums1.add(4.1);nums1.add(8.1);
	printList(nums);
	System.out.println(sumList(nums1));
	System.out.println(getList(5));
	System.out.println(list(13));
	System.out.println("*****************************************************************");
	List<String> words = new ArrayList<>();
	words.add("13123");words.add("123");words.add("13563");words.add("0123");words.add("003123");
	System.out.println(convertToList(words));
}
public static void printList(ArrayList<Integer> nums) {
	for(Integer num:nums) {
		System.out.print(num + " ");
	}
	System.out.println();
}
public static double sumList(List<Double> nums) {
	double sum = 0;
	for(Double n:nums) {
		sum+=n;
	}
	return sum;
}
public static ArrayList<Integer> getList(int size){
	
	
	ArrayList<Integer> r = new ArrayList<>(size);
	for(int i = 1; i<size+1;i++) {
		r.add(i);
	}
	return r;
}
public static List<Integer> list(int size){
	Random rand = new Random();
	List<Integer> r = new ArrayList<>(size);
	for(int i = 1; i<size+1;i++) {
		r.add(rand.nextInt(101));
	}
	return  r;
}

public static List<Integer> convertToList(List<String> ooo){
	List<Integer> nums = new ArrayList<>();
	for(int i = 0; i< ooo.size();i++) {
		nums.add(Integer.parseInt(ooo.get(i)));
	}
	return nums;
}
}

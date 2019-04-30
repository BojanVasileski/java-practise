package day32_costumMethods;

import java.util.Arrays;

public class ArrayParameters {
public static void main(String[] args) {
	int [] myArray = {44,22,66,11};
	printArray(myArray);
	printArray(new int [] {33,45,5,7});
	System.out.println("******************************************************");
	print2Arrays(new int [] {23,23,1,231314,3,2,3,1,2,3,1,31,2,3}, new int [] {3414,34,1,23,3,6,5,7,4});
	
}

public static void printArray(int [] nums) {
	for(int n:nums) {
		System.out.print(n+" ");
	}
	System.out.println();
}

public static void print2Arrays(int [] n1, int [] n2) {
	//print the larger array followed by the smaller array
	if(n1.length>n2.length) {
		printArray(n1);
		printArray(n2);
	}else if(n1.length<n2.length) {
		printArray(n2);
		printArray(n1);
	}else {
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
	}
}
}

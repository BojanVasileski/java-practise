package day34_methodsWReturn;

import java.util.*;

public class MainArray {
	public static void main(String[] args) {
		int [] numbers = countArray.getArray();
		System.out.println(Arrays.toString(countArray.getArray()));
		
		System.out.println("***************************************************");
		System.out.println(Arrays.toString(getRandomArray(10)));
		
		System.out.println("***************************************************");
		int [] newNumbers = getRandomArray(15);
		System.out.println(Arrays.toString(newNumbers));

	}
	
public static int[] getRandomArray(int size){
	int[] arr = new int[size];
	Random rand = new Random();
	for(int i = 0;i<size;i++) {
		arr[i] = rand.nextInt(101);
		
	}
	return arr;
}
}



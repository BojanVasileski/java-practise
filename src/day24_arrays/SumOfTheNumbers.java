package day24_arrays;

import java.util.Arrays;

public class SumOfTheNumbers {
public static void main(String[] args) {
	//create an array of integers length 3
	int[] numbers = new int[3];
	
	numbers[0] = 25;
	numbers[1] = 10;
	numbers[2] = 20;
	
	System.out.println(Arrays.toString(numbers));
	int sum = 0;
	//use for loop in order to loop through  the array and calculate the sum of all elements
	
	for(int i = 0; i < numbers.length; i++) {
		sum+= numbers[i];
	}
	
	System.out.println("Sum of numbers: "+sum);
	
	//find the largest value in the array
	int max = Integer.MIN_VALUE;			//find max value of array
	
	for(int i = 0; i<numbers.length;i++) {
		if(numbers[i] > max) {
			max = numbers[i];
		}
	}
	System.out.println("Max value: "+ max);
	
	
	
	int min = Integer.MAX_VALUE;              //find minimum value of array
	
	for(int i = 0;i<numbers.length;i++) {      
		if(numbers[i]< min) {
			min = numbers[i];
		}
	}
	
	System.out.println("Min value: "+min);
}
}

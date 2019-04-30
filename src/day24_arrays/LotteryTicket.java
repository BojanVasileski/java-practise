package day24_arrays;

import java.util.Arrays;

public class LotteryTicket {
public static void main(String[] args) {
	int[] lotteryNumbers = {12,45,3,62,42,90};
	
	
	System.out.println(Arrays.toString(lotteryNumbers));
	
	Arrays.sort(lotteryNumbers);
	
	System.out.println(Arrays.toString(lotteryNumbers));
	
	
	//finds the position of an item in arrays -> binarySearch, only works with sorted arrays -> Arrays.sort(lotteryNumbers);
	
	int index = Arrays.binarySearch(lotteryNumbers, 45);
	
	System.out.println("Position: "+index);
	
	
}
}

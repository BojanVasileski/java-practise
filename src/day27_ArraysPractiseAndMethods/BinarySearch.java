package day27_ArraysPractiseAndMethods;
import java.util.*;
public class BinarySearch {
public static void main(String[] args) {
	int nums[] = {4,6,7,10,55};
	//BINARYSearch, only works with sorted arrays! --> looks for a value in the array and returns an index ; simmilar to indexOf for string
	
	System.out.println(Arrays.binarySearch(nums, 7));
	
	System.out.println(Arrays.binarySearch(nums, 55));
	
	int i = Arrays.binarySearch(nums, 10);
	
	System.out.println(i);
	
	
	int[] nums2 = {40,6,23,10,123};   //for binary search to work we Array has to be sorted
	System.out.println(Arrays.binarySearch(nums2, 40));
}
}

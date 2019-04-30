package day27_ArraysPractiseAndMethods;
import java.util.*;
public class CopyOf2 {
public static void main(String[] args) {
	int[] nums1 = {34,56,23,1,55};
	int[] nums2 = Arrays.copyOf(nums1, nums1.length + 2);
	int[] nums3 = Arrays.copyOfRange(nums1, 1,3);
	
	System.out.println(Arrays.toString(nums2));
	System.out.println(Arrays.toString(nums3)); //чек дис аут
	
	int [] brandNew = {34,23,54,23};
	System.out.println("Length before: "+ brandNew.length);
	
	brandNew = Arrays.copyOf(brandNew, brandNew.length+5); //add more items to same array
	
	System.out.println("Length after: "+brandNew.length);
	
	
}
}

package day27_ArraysPractiseAndMethods;
import java.util.*;

public class ArraysClass {
public static void main(String[] args) {
	int[] nums = {123,31,23,5613,432,32,1};
	//toString Method
	
	System.out.println(Arrays.toString(nums));
	System.out.println("****************************************************************************");
	
	//sort method , sorts arrays ins assending order
	
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));
	
	String [] languages = {"Zulu","Spanish","Itallian","English","Arabic","Polish","Uzbek"};
	System.out.println(Arrays.toString(languages));
	Arrays.sort(languages);
	System.out.println(Arrays.toString(languages));
	
	//find lowest and largest value form nums2
	
	int[]nums2 = {2,3,62,23,5,3,6,1,0};
	Arrays.sort(nums2);
	System.out.println(Arrays.toString(nums2));
	int lowest = nums2[0];
	int largest = nums2[nums2.length-1];
	System.out.println("Lowest value is: "+ lowest);
	System.out.println("Largest value is: "+ largest);
	
	System.out.println("****************************************************************************");
	
	
	
	
	

	
}
}

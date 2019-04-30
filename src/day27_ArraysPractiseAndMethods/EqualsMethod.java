package day27_ArraysPractiseAndMethods;

import java.util.Arrays;

public class EqualsMethod {
	public static void main(String[] args) {
		int[] nums1 = {4,5,6,10,100};
		int[] nums2 = {4,5,6,10,100};
		
		System.out.println(Arrays.equals(nums1, nums2));
		
		if (Arrays.equals(nums1, nums2)) {
			System.out.println("They are exactly the same");
		}else {
			System.out.println("Missmatched values present");
		}
		System.out.println("********************************************************************");
		
		String[] strArr1 = {"one","two","three"};
		String[] strArr2 = {"One","Two","three"};
		
		System.out.println(Arrays.equals(strArr1, strArr2));
		
		boolean match = Arrays.equals(strArr1,strArr2);
		System.out.println("Match: "+match);
		
	}
	

}

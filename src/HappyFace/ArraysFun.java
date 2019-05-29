package HappyFace;

import java.util.Arrays;

public class ArraysFun {
public static void main(String... args) {
	int[] nums1 = {10,20,5,3};
	int [] nums2 = {5,1,1,4};
	
	
	int[] nums3 = new int [nums1.length];
	
	for(int i = 0;i<nums3.length;i++) {
		nums3[i]=nums1[i]+nums2[i];
	}
	System.out.println(Arrays.toString(nums3));
}
}

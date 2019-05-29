package day39_arrayList04;
import java.util.*;
public class UniqueValues {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(10);nums.add(10);nums.add(7);nums.add(8);
		nums.add(8);nums.add(3);nums.add(4);nums.add(8);
		
		List<Integer> uniques = new ArrayList<>();
		for(Integer u:nums) {
			//assign num to unique if num is not already there
			
				if(!uniques.contains(u)) {
					uniques.add(u);
				}
			
		}
		System.out.println(uniques);
		
		
		List<Integer> unique2 = new ArrayList<>();
		
		for(int i = 0; i< nums.size();i++) {
			int count = 0;
			Integer value = nums.get(i);
			for(int j = 0; j< nums.size();j++) {
				if(nums.get(j) == value  && i!=j) {
					count++;
					break;
				}
			}
			if(count == 0) {
				unique2.add(value);
			}
		}
	}
}

package day38_arraylis03;

import java.util.*;

public class ContainsAll {
	public static void main(String[] args) {
		List<Integer> num1 = new ArrayList<>();
		num1.add(10);
		num1.add(20);
		num1.add(30);
		num1.add(40);
		num1.add(40);
		
		List<Integer> num2 = new ArrayList<>();
		num2.add(20);
		num2.add(10);
		num2.add(40);
		num2.add(30);
		//test if num1 has all nums2 values
		
		if(num1.containsAll(num2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		System.out.println(num1.containsAll(num2) && num2.containsAll(num1));
		
		List<String> planA = new ArrayList<>();
		planA.add("java");
		planA.add("replit");
		planA.add("ping pong");
		planA.add("food");
		planA.add("run");
		planA.add("sleep");
		
		List<String> planB = new ArrayList<>();
		planB.add("food");
		planB.add("run");
		planB.add("sleep");
		planB.add("java");
		planB.add("ping pong");
		planB.add("replit");
		
		if(planB.containsAll(planA) && planA.containsAll(planB)) {
			System.out.println(true);
		}else {
			System.out.println(false
					);
		}
	}
}

package day21_;

import java.util.*;

public class WarmUp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num1=0;
	int num2=0;
	if(num1+num2<=100){do {
	System.out.println("Enter num1:");
	num1 = scan.nextInt();
	
	System.out.println("Enter num2:");
	num2 = scan.nextInt();
	}while(num1+num2 <=100);
	}else if(num1+num2 >100) {
		System.out.println("Good Numbers");
	}
	System.out.println("Good Numbers");
	
}
}

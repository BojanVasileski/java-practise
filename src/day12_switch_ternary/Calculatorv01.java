package day12_switch_ternary;

import java.util.Scanner;

public class Calculatorv01 {
//enter first number
//enter second number
//select operation : +,-,*,/,%
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1, num2, result=0.0;
		String operator;
		
		System.out.println("Enter first number");
		num1=scan.nextDouble();
		
		System.out.println("Enter second number");
		num2=scan.nextDouble();
		
		System.out.println("Select operator: + , - , * , / , % ");
		operator = scan.next();
	
	if (operator.equals("+")) {
		result = num1 + num2;
		System.out.println(result);
		
	}else if(operator.equals("-")) {
		result = num1 - num2;
		System.out.println(result);
		
	}else if (operator.equals("%")) {
		result = num1 % num2;
		System.out.println(result);
		
	}else if(operator.equals("*")) {
		result = num1 * num2;
		System.out.println(result);
		
	}else if(operator.equals("/")) {
		result = num1 / num2;
		System.out.println(Math.round(result));  ///Math.round -> to round to a whole number
		
	}else {
		System.out.println("Invalid input "+ operator);
		return; //gets out on main method, do not execute the remaining code
	}
	System.out.println("Result "+ result);
}
}
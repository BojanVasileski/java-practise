package day12_switch_ternary;

import java.util.Scanner;

public class Calculatorv02 {
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	double num1, num2, result=0.0;
	String operator ;
	
	System.out.println("Enter first number");
	num1=scan.nextDouble();
	
	System.out.println("Enter second number");
	num2=scan.nextDouble();
	
	System.out.println("Select operator: + , - , * , / , % ");
	operator = scan.next();

	
	switch(operator) {
	case "+":
		result = num1 + num2;
		System.out.println(result);
		break;
	case "-":
		result = num1 - num2;
		System.out.println(result);
		break;
	case "*":
		result = num1 * num2;
		System.out.println(result);
		break;
	case "/":
		result = num1 / num2;
		System.out.println(result);
		break;
	case "%":
		result = num1 % num2;
		System.out.println(result);
		break;
		default:
			System.out.println("Invalid Imput!");
	}
	
}
}
package day31_method03;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	//add substract multiplyu divide remainder
	
	divide(0,0 );
	remainder(0,0);
	divide(0,0);
	divide(0,0);
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter new numbers:");
	double n1=scan.nextInt();
	double n2=scan.nextInt();
	System.out.println("Select operation: +, -, /, *, %");
	String operator = scan.next();
	
	switch(operator) {
	case "+":
		add(n1,n2);
		break;
	case "-":
		subtract(n1,n2);
		break;
	case "/":
		divide(n1,n2);
		break;
	case "*":
		multiply(n1,n2);
		break;
	case "%":
		remainder(n1,n2);
		break;
	}
	
	
}

public static void add(double num1, double num2) {
	
	double result = num1+num2;
	System.out.println("Result "+result);
}
public static void subtract(double num1, double num2) {
	double result = num1-num2;
	System.out.println("Result "+result);
}
public static void multiply(double num1, double num2) {
	
	double result = num1*num2;
	System.out.println("Result "+result);
}
public static void divide(double num1, double num2) {
	if(num2==0) {
		System.out.println("cannot / by zero");
		return;
	}
	double result = num1/num2;
	System.out.println("Result "+result);
}
public static void remainder(double num1, double num2) {
	double result = num1%num2;
	System.out.println("Result "+result);
}
}

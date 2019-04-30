package day31_method03;

import java.util.Scanner;

public class CountUp {
public static void main(String[] args) {
	countUp(0);
	countUp(10);
	countDown(15);
	countDown(0);
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter number to countUp");
	int inputNum = scan.nextInt();
	countUp(inputNum);
	
	
}

public static void countUp(int num) {
	if(num<1){
		System.out.println("Invalid Input");
	}else {
	for(int i = 1; i<=num;i++) {
		
		System.out.print(i+" ");
	}
	System.out.println();
}
}

public static void countDown(int num) {
	if(num<1){
		System.out.println("Invalid Input");
	}else {
	for(int i = num; i>=1;i--) {
		
		System.out.print(i+" ");
	}
	System.out.println();
}
}

}


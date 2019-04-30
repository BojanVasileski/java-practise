package day6_operators2;

import java.util.Scanner;

public class ScannerYourName {
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi, What is your name?");
		
		String name = input.next(); //accept String imput
		
		System.out.println("Nice to meet you " + name);
	}

}

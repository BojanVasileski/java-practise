package day14_string_manipulation;

import java.util.Scanner;

public class CompreingStringLength {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Word1:");
	String word1 = scan.next();
	System.out.println("Word2:");
	String word2 = scan.next();
	
	if(word1.length() > word2.length()) {
		System.out.println(word1+" is longer");
	}else if(word1.length() < word2.length()) {
		System.out.println(word2+" is longer");
	}else if(word1.length() == word2.length()) {
		System.out.println("word1Value and word2Value are the same length");
	}
	
	
	
		
}
}

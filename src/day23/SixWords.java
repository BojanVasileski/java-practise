package day23;

import java.util.*;

public class SixWords {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word = "";
	String full = "";
	for(int i = 0; i<=5;i++) {
		System.out.println("Enter a word:");
		word = scan.next();
		
		full += word+ ", ";
		
	}
	
	System.out.println(full.substring(0, full.length()-2));
	
}
}

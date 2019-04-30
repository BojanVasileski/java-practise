package day19_loopscontd;

import java.util.Scanner;

public class Pallindrome {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
String word = scan.next();
	
	String reverse =  "";
	//loop through word in reverse order and cocatinate each char to reversed string
	//compare if word and reversed ae equal
	int idx = (word.length()-1);
	
	while (idx>=0) {
		reverse+= word.charAt(idx);
		idx--;
		
	}

	//compare if word and reverse are equal
	System.out.println(reverse);
	if (reverse.equals(word)) {
		System.out.println("Its palindrome");
	}else {
		System.out.println("Its not palindrome");
	}
	
	
	
}
}

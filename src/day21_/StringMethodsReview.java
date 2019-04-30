package day21_;

import java.util.Scanner;

public class StringMethodsReview {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word = "javva";
	String container = "";
	
	char ch = word.charAt(0);
	
	System.out.println(container.contains(""+ch));
	
	if(!container.contains(""+ch)) {
		container += ch;
	}
	
	
	if(container.indexOf(ch)==-1) {
		container += ch;
	}
	System.out.println("Unique:" + container);
			
	
	String word2 = "bananas";
	String container2 = "";
	int i =0;
	char ch2 = word2.charAt(i);
	System.out.println("Ch2:"+ ch2);
	 i =1;
	 ch2 = word2.charAt(i);
	System.out.println("Ch2:"+ ch2);
	 i =2;
	 ch2 = word2.charAt(i);
	System.out.println("Ch2:"+ ch2);
}
}

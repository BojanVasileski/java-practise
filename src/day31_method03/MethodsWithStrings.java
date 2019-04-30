package day31_method03;

import java.util.Arrays;

public class MethodsWithStrings {
public static void main(String[] args) {
	countWords("Java is Fun");
	googleSearchResults("About 524,000,000 results (1.06 seconds) ");
}

public static void countWords(String sentence) {
	
	String [] words = sentence.split(" ");
	
	System.out.println("Words in this sentence: "+ Arrays.toString(words));
	
	System.out.println("Count of words: "+words.length);
	
}

public static void googleSearchResults(String result) {
	//result ="About 524,000,000 results (1.06 seconds) ";
	String [] results = result.split(" ");
	
	
	
	System.out.println("Reults count: "+results[1].replace(",", ""));
	System.out.println("Time in seconds: "+results[3].replace("(",""));
}

}

package day26_arrays;

import java.util.Arrays;

public class Split {
public static void main(String[] args) {
	
	String words = "java,love,hope,selenium";
	
	String [] wordsArray = words.split(",");
	
	System.out.println("Count: " + wordsArray.length);
	
	System.out.println(Arrays.toString(wordsArray));
	
	for(String word : wordsArray) {
		System.out.println(word);
	}
	System.out.println();
	String diceResult = "1 - 20 of 1,461 positions";
	String [] diceWords = diceResult.split(" ");
	System.out.println(diceWords.length);
	
	System.out.println();
	
	String[] diceArray2 = diceResult.split("of");
	System.out.println(diceArray2[1].trim());
	
	
	String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy."; 
	
	String [] allWords = sentence.split(" "); 
	String [] happySplit = sentence.split("happy");
	String [] iSplit = sentence.split("I");
	
	System.out.println(Arrays.toString(allWords));
	System.out.println(Arrays.toString(happySplit));
	System.out.println(Arrays.toString(iSplit));
	
	
	System.out.println("*******************************************************************************************************************");
	
	String word = "love";
	char[] charsArray = word.toCharArray();
	
	for (char ch : charsArray) {
		System.out.println(ch);
	}
	
	
}
}

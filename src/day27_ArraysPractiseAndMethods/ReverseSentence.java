package day27_ArraysPractiseAndMethods;

import java.util.Arrays;

public class ReverseSentence {
public static void main(String[] args) {
	String srt = "Hi my name is Bojan";
	String reversed = "";
	String [] wordsArray = srt.split(" ");
	
	for(int i= wordsArray.length-1;i>=0;i--) {
		reversed += wordsArray[i]+" ";
	}
	System.out.println(reversed);
}
}

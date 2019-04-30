package day35_practice;

public class EncriptionFun {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		String word = "easter";
		//get a char from word
		//find index of the char in alphabet
		//read the char from encrypted at that index
		//add to some string
		String wordEnc = "";
		
		char first = word.charAt(0);
		int position = alphabet.indexOf(first);
		System.out.println("position: "+position);
		char enChar = encrypted.charAt(position);
		System.out.println(first);
		
		
		//with a loop
		for(int i = 0; i < word.length();i++) {
			char ch = word.charAt(i);
			//find in alphabet
			int index = alphabet.indexOf(ch);
			System.out.print(encrypted.charAt(index));
		}
		
	}
}

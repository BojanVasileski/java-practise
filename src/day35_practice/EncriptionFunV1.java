package day35_practice;

public class EncriptionFunV1 {
public static void main(String[] args) {
	String normal = "html";
	String encrypted = encryptWord(normal);
	System.out.println("normal: "+normal+"\n"+"encrypted: "+encrypted);
	
	System.out.println(encryptSentence("java is fun"));
}
	
public static char encryptChar(char ch) {
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	String encrypted ="zyxwvutsrqponmlkjihgfedcba";
	
	return encrypted.charAt(alphabet.indexOf(ch));
}
public static String encryptWord(String word) {
	String cyphered ="";
	for (int i  = 0; i< word.length();i++) {
		cyphered += encryptChar(word.charAt(i));
	}
	return cyphered;
}
public static String encryptSentence(String sentence) {
	String [] wordsArr = sentence.split(" ");
	String retValue = "";
	for(String word:wordsArr) {
		retValue += encryptWord(word) + " ";
	}
	return retValue.trim();
}
}

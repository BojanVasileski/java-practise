package day22_loopsPratice;

public class FindHowManyUsingReplace {
public static void main(String[] args) {
	String word = "inecluding webpages, images";
	/*find how many chars in word
	 * get length of word
	 * replace all with wmpty
	 * get the length of word without e
	 * do a minus
	 */
	int length1 = word.length();
	word = word.replace("e", "");
	int length2 = word.length();
	
	System.out.println("Length 1: "+ length1);
	System.out.println("Length 2: "+ length2); 
	
	int count = length1-length2;
	System.out.println(count);
	
}
}

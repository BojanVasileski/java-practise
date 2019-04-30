package day22_loopsPratice;

public class SubstringPractice {
public static void main(String[] args) {
	String word = "love";

	/*print each char in sepatate line using substring
	 * 
	 */
	
	
	
	int i = 0;
	
	while (i <= word.length()-1) {
		System.out.println(word.charAt(i));
		i++;
	}
	
	System.out.println("############################################################################################");
	
	for(int n = 0; n <= 3; n++) {
		System.out.println(word.substring(n, n+1));
	}
	
	System.out.println("##########################################REVERSE####################################");
	//print in reverse
	
	for(int n = 3; n >= 0 ; n--) {
		System.out.println(word.charAt(n));
	}
	
	int start = 1; 
	int end = 5;
	String word2 = "UnitedStates";
	
	System.out.println(word2.substring(start, end));
}
}

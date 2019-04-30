package MentoringSessions;

import java.util.Scanner;

public class q2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a word");
	String str = scan.nextLine();
	
	int count = 0;
	
	for(int i = 0; i < str.length()-3; i++) {
		if(str.substring(i, i+2).equals("co") && str.substring(i+3,i+4).contentEquals("e")) {
			count++;
			
		}
	}
	System.out.println(count);
	
	
	
}
}





/*Return the number of times that the string "code" appears anywhere in the given string,
 * except well accept any letter for the 'd', so "cope" and "code" count.
 * 
 */

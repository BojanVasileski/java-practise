package MentoringSessions;

import java.util.Scanner;

public class q3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	boolean result = false;
	System.out.println("Enter a word");
	String a = scan.next();
	System.out.println("Enter second word");
	String b = scan.next();
	if (b.length()<a.length()) {
		if(b.equalsIgnoreCase(a.substring(a.length()-b.length()))) {
			result = true;
			
		}else {
			result = false;
		}
		
	}else  {
		if (a.equalsIgnoreCase(b)) {
			result=true;
		}
	}
	System.out.println(result);
}
}
/*Given two strings, return true if either of the strings appear at the very end of the other string
 * ,ignorring upper/lower case differences (in other words the computations shound not be "case sensitiec")
 * 
 * 
 * 
 * endOther("Hiabc" , "abc") -> true
 * endOther("AbC", "HibBc")
 */


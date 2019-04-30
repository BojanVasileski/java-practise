
package day14_string_manipulation;

public class CharAt {
public static void main(String[] args) {
	
	String word = "Computer" ; 
	System.out.println(word.length()+"\n");
	System.out.println(word.charAt(0));
	System.out.println(word.charAt(1));
	System.out.println(word.charAt(2));
	System.out.println(word.charAt(3));
	System.out.println(word.charAt(4));
	System.out.println(word.charAt(5));
	System.out.println(word.charAt(6));
	System.out.println(word.charAt(7)+"\n\n");
	
	String w = "Te sakam sakam se do mesecinata";
	if(w.charAt(0)== 'J') {
	System.out.println("J is first char");
	}else {
		System.out.println("J is not first char");
	}
	 
	
	String word3 = "Dzver";
	
	if(word3.charAt(0) == word3.charAt(4)) {
		System.out.println("First and last match");
	}else if(word3.charAt(0) != word3.charAt(4)) {
		System.out.println("First and last dont match");
	}
	
	
	String word4 = "asdasdsgvxz";
	
	char lastChar = word4.charAt(word4.length()-1);
	
	System.out.println("Last value og "+ word4+ " is "+ lastChar);
	
	
	
	
	
	
}
}

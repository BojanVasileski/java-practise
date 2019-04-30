package day20_forloop;

public class PrinEachChar {
public static void main(String[] args) {
	String word = "Cybertek";
	//using for loop print each char one by one
	
	for(int i = 0;i < word.length(); i++) {
		System.out.println(word.charAt(i));
	}
	System.out.println("");
	//using for look print onlu vowels (a, e, i ,o, u)
	for(int i = 0;i < word.length(); i++) {
		char letter = word.toLowerCase().charAt(i);
		if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' ) {
			System.out.print(letter+ ", ");
			
		}
		
	}
	System.out.println("");
	for(int i = 0;i < word.length(); i++) {
		char letter = word.toLowerCase().charAt(i);
		if(!(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' )) {
			System.out.print(letter+ ", ");
			
		}
	}
	
}
}

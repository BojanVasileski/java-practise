package day18_while_dowhile_loop;

public class Alphabet {
public static void main(String[] args) throws InterruptedException {
	char letter = 'a';
	while(letter<='z') {
	System.out.print(" "+letter);
	letter++;
	Thread.sleep(1);
	}
	System.out.println("");
	char capitals = 'A';
	while(capitals <= 'Z') {
		System.out.print(" "+capitals);
		capitals++;
		Thread.sleep(1);
	}
	System.out.println("");
	letter--;
	while(letter>='a') {
		System.out.print(" "+letter);
		letter--;
		Thread.sleep(1);
	}
	System.out.println("");
	
	String letters = "";
	char muLetter = 'A';
	
	System.out.println(letters);

	
	while(muLetter <= 'Z') {
		letters = letters + muLetter;
		System.out.println(letters);
		muLetter++;
		
	}
}
}

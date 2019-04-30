package day19_loopscontd;

public class PrintLetters {
public static void main(String[] args) throws InterruptedException {
	String word = "Amazon";
	//print each car one by ne in separate lines
	int idx = 0;
	while(idx<word.length()) {
	System.out.println(word.charAt(idx++));
	Thread.sleep(333);
	
	}
	int idx2 = word.length()-1;
	
	while (idx2 >=0) {
		
		System.out.println(word.charAt(idx2--));
		Thread.sleep(333);
		
		
	}
	
		
}
}

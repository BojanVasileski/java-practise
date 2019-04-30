package day22_loopsPratice;

public class StringPractiCe {
public static void main(String[] args) {
	String sentence = "He said hi, then she replied hi. hi guys!";
	String compare = "hi";
	//print letters in pairs
	int i = 0;
	int count = 0;
	for(int n = 0; n < sentence.length()-1;n++) {
		String temp = sentence.substring(n,n+2);
		
		if(temp.equals(compare)) {
			count++;
		}
	}
	
	System.out.println("################################");
	System.out.println("Count: " + count);
	
	
	
}
}

package day23;

public class PrintWord {
public static void main(String[] args) {
	String str = "love";
	
	for(int i = 0; i<str.length(); i++) {
		if(str.substring(i, i+1).equals("e")) {
			continue;
		}else {
			
		System.out.println(str.substring(i, i+1));
		}
	}
	
	
	
}
}

package day20_forloop;

public class IndexOf {
	public static void main(String[] args) {
		String word = "amazon";
		char letter = 'z';
		int index = -1;
		
		//using for loop look for a letter, if its a match assign value to index
		//exit the for loop
		//print value of index
		
		
		
		for(int i = 0; i < word.length(); i++ ) {
			if (word.charAt(i) == letter) {
				index = i;
				break;
		}		
	}
		System.out.println("Index of " + index);

}
}
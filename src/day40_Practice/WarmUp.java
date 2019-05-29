package day40_Practice;
import java.util.*;
public class WarmUp {
public static void main(String[] args) {
	ArrayList<String> words = new ArrayList<>();
	words.add("hello");
	words.add("love");
	words.add("big");
	words.add("love");
	words.add("love");
	
	System.out.println(count0occurances(words,"love"));

}
	
	public static int count0occurances(ArrayList<String> str, String word) {
		int count = 0;
		for(int i = 0;i<str.size();i++) {
			if(str.get(i).equals(word)) {
				count++;
			}
		}
		
		return count;
	}
}

package day16_string_manipulation;

public class BuildWord {
public static void main(String[] args) {
	String chars = "<<>>";
	String word = "java";
	String result = chars.substring(0,2) + word + chars.substring(2);    //чек дис аут
	
			
	System.out.println(result);
}
}

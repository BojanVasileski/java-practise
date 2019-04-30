package day16_string_manipulation;

public class Concat {
	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.concat("+selenium"));
		word = word.concat("+eclipse");
		System.out.println(word);
		
		String word2 = "Hi";
		word2 = word2.concat("-hey").concat("-how are you");   //chaining
		System.out.println(word2);
	}

}

package day15_string_manipulation;

public class IndexOf {
public static void main(String[] args) {
	String word1 = "github";
	System.out.println(word1.indexOf('t'));
	System.out.println(word1.indexOf("th"));
	System.out.println(word1.indexOf("hub"));
	System.out.println(word1.indexOf('0'));
	
	
	String url = "www.okta.com";
	int index = url.indexOf(".");
	System.out.println("Position of . : "+index);
	System.out.println(url.charAt(4));
	System.out.println(url.charAt(index+1));
	
	
	String title = "Java - Google Search";
	//find possiton og - and chek if space is on rigt and left side
	
	int dash = title.indexOf('-');
	System.out.println(title.charAt(dash - 1));
	System.out.println(title.charAt(dash + 1));
	
	
	
	
	
	
	String country = "United States of America";
	int states = country.indexOf("States");
	System.out.println(states);
	
	
	String word2 = "java, c++, python, tamcat, eclipse";
	if(word2.contains("c++")) {
		System.out.println("c++ is there");
	}else {
		System.out.println("c++ is not there");
	}
	
	
	if(word2.indexOf("c++")> -1) {
		System.out.println("c++ is there");
	}else {
		System.out.println("c++ is there");
	}
	
	
	
	
	
	
	
	
}
}

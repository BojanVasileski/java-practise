package day15_string_manipulation;

public class StartsEndsWith {
public static void main(String[] args) {
	String word1 = "eclipse";
	System.out.println(word1.startsWith("e"));
	System.out.println(word1.startsWith("ecl"));
	System.out.println(word1.startsWith("eclipse"));
	
	System.out.println(word1.startsWith("Ec"));
	System.out.println(word1.endsWith("e"));
	System.out.println(word1.endsWith("ipse"));
	System.out.println(word1.endsWith("java"));
	
	System.out.println(word1.toUpperCase().endsWith("PSE"));   //####################### чек тис аут
	//Mr. Ms. Dr. Ms.
	String word2 = "Mro. Jackson";
	
	if(word2.startsWith("Mr.")) {
		System.out.println("its a man");
	}else if(word2.startsWith("Ms.")) {
		System.out.println("its a woman");
	}else if(word2.startsWith("Mrs.")) {
		System.out.println("its a married woman");
	}else if(word2.startsWith("Dr.")) {
		System.out.println("its a doctor man/woman");
	}else {
		System.out.println("unknown terminology");
	}
	
	
	
	
}
}

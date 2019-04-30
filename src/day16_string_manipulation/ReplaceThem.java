package day16_string_manipulation;

public class ReplaceThem {
public static void main(String[] args) {
	
	String sentence = "Coding is fun, its my hobby!";
	String noSpaces = sentence.replace(" ", "");
	System.out.println(noSpaces);
	sentence =sentence.replace(",", "!!!");
	System.out.println(sentence);
	
	
	String mixed = "(#@$&(ja)#${va)(#WE";
	mixed = mixed.replace("(#@$&(", "").replace(")#${", "").replace(")(#WE", "");    //chaining
	//mixed = mixed.replace(")#${", "");              //can be done in separate statement
	//mixed = mixed.replace(")(#WE", "");
	
	
	mixed = mixed.replace("a", "");
	System.out.println(mixed);
	
	
	String result = "About 95,000,000 results (0.46 seconds)";
	//using replace, get number of results
	//result = result.replace("About ", "").replace(" results (0.46 seconds)","");   //might break the code
	result = result.replace("About ", "");
	System.out.println(result);
	
	result = result.substring(0,result.indexOf(" "));
	
	result = result.replace(",", "");
	
	System.out.println(result);	
}
}

package day09_stringequals_conditionals;

public class IfElseNoBraces {
public static void main(String[] args) {
	String day = "Tueseday";
	
	if(day.equals("Tueseday")) 
		System.out.println("Today is Tueseday");
	else 
		System.out.println("Today is not Tueseday");
		System.out.println("Tueseday is not today"); //this line is not part of else block
	
}
	
}

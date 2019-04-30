package day16_string_manipulation;

public class GetNumbersFromString {
public static void main(String[] args) {
	String sentence = "I wrotee [102] lines of code today.";
	int first = sentence.indexOf('[')+1;					//чек дис аут
	int second = sentence.indexOf(']');						//чек дис аут
	
	String number = sentence.substring(first,second);
	System.out.println(number);
	 
	
	System.out.println(sentence.substring(sentence.indexOf('[')+1, sentence.indexOf(']')));
	//check if code count is more than 100
	int countNumber = Integer.parseInt(number);            //чек дис аут
	
	if(countNumber > 100) {
		System.out.println("Wrote more than 20 lines of code today");
	}else {
		System.out.println("Not enough coding for today");
	}
	
	
}
}

package day16_string_manipulation;

public class ExtraEnd {
	public static void main(String[] args) {
	String str = "Java";
	String result = "";
	if(str.length() == 2) {
		result = str.concat(str).concat(str);
		System.out.println(result);
		
	}else {
		result = str.substring(str.length() - 2);
		result += result + result;
		System.out.println(result);
	}
}
}

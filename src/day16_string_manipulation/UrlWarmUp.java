package day16_string_manipulation;
import java.util.Scanner;
public class UrlWarmUp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url:");
		String url = scan.next();
		
		
		// www.amazon.com
		if(url.startsWith("www.") ) {				// чек тис аут
			System.out.println("String starts with www.");
		}else {
			System.out.println("Site cannot be reached");
			
		}
		
		if(url.charAt(url.length()-4) == '.') {     // чек тис аут
			System.out.println(". is present");
		}else {
			System.out.println(". is not present.");
		}
		
		int dotIndex = url.lastIndexOf('.');
		String domain = url.substring(4,dotIndex);
		String extension = url.substring(dotIndex,url.length());    //чек дис аут
		System.out.println(domain);
		System.out.println(extension);
		
		
	}

}

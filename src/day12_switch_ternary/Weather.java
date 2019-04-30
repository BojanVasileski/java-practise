package day12_switch_ternary;
import java.util.Scanner;
public class Weather {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Whats the weather?");
	String weather = scan.next().toLowerCase() ; //sunny
	
	switch(weather) {
	case "sunny":
		System.out.println("Go to Park\nCode Java");
		break;
	case "hot":
		System.out.println("Go Swimming\nCode Java");
		break;
	case "rainy":
		System.out.println("Go Shopping\nCode Java");
		break;
	case "windy":
		System.out.println("Fly a kite\nCode Java");
		System.out.println("Hello");
		break;
	case "snow":
		System.out.println("Chain your tires\nGo to Park\nCode Java");
		break;
		default:
			System.out.println("Code java in any weather");
	
	}
	
	System.out.println("\n\nEnd of program");
}
}

package practie01;
import java.util.*;
public class IfStatements {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	//please write a program that will print a season name based on the input, value will be provided by the scanner
	
	System.out.println("Enter season number");
	int number = scan.nextInt();
	
	if(number == 1) {
		System.out.println("Spring");
	}else if(number == 2) {
		System.out.println("Summer");
	}else if (number == 3) {
		System.out.println("Fall");
	}else if (number == 4) {
		System.out.println("Winter");
	}
	
	
	
}
}

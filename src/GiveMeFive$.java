
import java.util.*;
public class GiveMeFive$ {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int dollars = 0;
	while(dollars != 5) {
		System.out.println("Break yo self give me $5!");
		dollars = scan.nextInt();
	}
	System.out.println("Thank you!");
	
}
}

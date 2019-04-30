package day12_switch_ternary;

import java.util.Scanner;

public class DaySelector {
	public static void main(String[] args) {
		int day;
		Scanner scan = new Scanner(System.in);
		System.out.println("What day is it");
		day = scan.nextInt();
		switch(day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tueseday");
			break;
		case 3:
			System.out.println("wedneday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
			default:
				System.out.println("No such day");
		}
		
		
		
	}

}

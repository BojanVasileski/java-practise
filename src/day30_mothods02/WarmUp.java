package day30_mothods02;

import java.util.Scanner;

public class WarmUp {
public static void main(String[] args) {
	introduce();
	
	print5Stars();
	//for(int i = 0;i<100;i++) {
		//print5Stars();
	//}
	
	
}

public static void introduce() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Whats your name?");
	String name = scan.nextLine();
	System.out.println("Nice to meet you "+name);
	
}

public static void print5Stars(){
	System.out.println("* * * * *");
}
}

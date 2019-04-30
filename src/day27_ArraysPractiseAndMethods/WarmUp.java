package day27_ArraysPractiseAndMethods;

import java.util.Scanner;

public class WarmUp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int [] time1 = new int[2];
	int [] time2 = new int[2];
	
	
	System.out.println("Enter Time1:");
	time1[0] = scan.nextInt();
	time1[1] = scan.nextInt();
	
	System.out.println("Enter Time2:");
	time2[0] = scan.nextInt();
	time2[1] = scan.nextInt();
	
	
	if(time1[0]>23 || time1[0]<0) {
		System.out.println("Invalid Hours!");
		return;
	}else if(time1[1]>59 || time1[1]<0) {
		System.out.println("Invalid Minutes!");
		return;
	}else if(time2[0]>23 || time2[0]<0) {
		System.out.println("Invalid Hours!");
		return;
	}else if(time2[1]>59 || time2[1]<0) {
		System.out.println("Invalid Minutes!");
		return;
	}
	
	
	if(time1[0]>time2[0]) {
		System.out.println("Time2 is earlier"); 
	}else if(time1[0]<time2[0]) {
		System.out.println("Time1 is earlier"); 
	}else if(time1[0] == time2[0]&& time1[1]>time2[1]) {
		System.out.println("Time2 is earlier"); 
	}else if(time1[0] == time2[0]&& time1[1]<time2[1]) {
		System.out.println("Time1 is earlier"); 
	}
	
	
	
	
	
}
}

package day30_mothods02;
import java.util.Random;
import java.util.Scanner;
public class MyNumber {
public static void main(String[] args) {
	showMe5Numbers();
	showMe5Numbers();
	showMe5Numbers();
	showMe5Numbers();
	showMe5Numbers();
	
	doPush100Ups();
	System.out.println("**********************************");
	rangePrint();	
}

public static void showMe5Numbers(){
	Random rand = new Random();
	
	for(int i = 0;i<5;i++) {
		if(i==4) {
			System.out.print(rand.nextInt(1001));
	
	}else {
		System.out.print(rand.nextInt(1001)+", ");
	}
		
	}
	System.out.println();
}

public static void doPush100Ups(){
	for(int pushUp=1;pushUp<=10;pushUp++) {
		System.out.println("Pushup - "+pushUp);
	}
	System.out.println("Time to rest");
}

public static void rangePrint() {
	Scanner scan = new Scanner (System.in);
	System.out.println("enter 2 Integers:");
	int one = scan.nextInt();
	int two = scan.nextInt();
	
	if(two>one) {
	for(int i = one;i<=two;i++) {
		System.out.println(i);
	}
	}else if(one>two) {
		for(int i = one;i>=two;i--) {
			System.out.print(i+" ");
		}
	}else if(one==two) {
		System.out.println(one);
	}
}



}
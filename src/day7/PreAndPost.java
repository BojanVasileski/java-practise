package day7;

public class PreAndPost {
public static void main(String[] args) {
	int num = 0;
	int num2 = num++;  //post increment
	
	System.out.println("num: " + num);
	System.out.println("num2: " + num2);
	
	
	int n = 20;
	int n2 = ++n;  //pre increment
	System.out.println("n: " + n);
	System.out.println("n2: " + n2);
	
	int bananas = 6;
	int pears = bananas++;
	int apples = ++bananas;
	System.out.println(bananas);
	System.out.println(pears);
	System.out.println(apples);
	 
	
	int friends = 10;
	System.out.println(friends++);
	System.out.println(friends);
    int p1= 10;
    int sum =  p1++ +5;
    
    
    System.out.println("price is " + p1);
    System.out.println("sum is " + sum);
    
    int batteries = 8;
    int oldBatteries = 5;
    int totalBatteries = batteries++ + ++oldBatteries;
    
    System.out.println("batteries: " + batteries);
    System.out.println("oldBatteries: " + oldBatteries);
    System.out.println("totalBatteries: " + totalBatteries);
    



}
}

package day20_forloop;

import java.util.*;

public class MultiplicationTableShort {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter number:");
    int num =scan.nextInt();
    // check if it is valid.
    //if it is not return
    
    if(num<1 || num >10) {
        System.out.println("Invalid input");
        return;//stop execution here
        
    }else {
        for(int i = 1; i <=10; ++i) {
            System.out.println(num + " x "+i+" = " + (num * i));
        }
    }
}
}

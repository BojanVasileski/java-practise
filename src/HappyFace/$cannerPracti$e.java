package HappyFace;

import java.util.Scanner;

public class $cannerPracti$e {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //WRITE YOUR CODE HERE 
    
    
    String maxPayne = "Max Payne";
    String alanWake = "Alan Wake";
    System.out.println("Enter full name:");
    String name = scan.next();
   
    switch(name) {
    case "alan wake":
    	System.out.println("User found!");
    	break;
    case "max payne":
    	System.out.println("User found!");
    	break;
    	default:
    		System.out.println("User not found!");
    }
    
  }
}
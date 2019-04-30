package HappyFace;

import java.util.Scanner;

public class HappyFace {
  public static void main(String[] args) {
    //ENTER CODE HERE
    int itemPrice;
    int quarters, dimes, nickels;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter price in cents:");
    itemPrice = scan.nextInt();
    
    if(itemPrice<25 && itemPrice>100 && itemPrice%5!=0){
      System.out.println("Invalid Price!");
    }else{
      quarters = (100-itemPrice) / 25;
      dimes = (100-itemPrice) / 10;
      nickels = (100-itemPrice) / 5;
      System.out.println("Your change is "+quarters+" quarters, "+dimes +" dimes, and "+ nickels+" nickels." );
    }
    
    
  }
}
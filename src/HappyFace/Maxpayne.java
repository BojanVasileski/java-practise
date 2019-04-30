package HappyFace;
import java.util.*;


public class Maxpayne {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    //YOUR CODE HERE
    if (word.length()%2==1 && word.length()>=3){
  
      System.out.println(word.charAt(word.length()/2-1));
    }else if(word.length()==1){
      System.out.println(word+""+word+""+word);
    }
    
    
  }
}

package HappyFace;

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    
    //TODO: write your code below
   
    int solo =nums[0];
    for(int j = 0; j<nums.length-1 ;j++){
      if(solo != nums[j+1]){
        solo = nums[j];
        
      }else if(solo == nums[j+1]){
      
        solo = nums[j];
        continue;
      }
    }
    
    System.out.print(solo);
    
  }
}
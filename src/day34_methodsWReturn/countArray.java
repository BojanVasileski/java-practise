package day34_methodsWReturn;

import java.util.Arrays;

public class countArray {
public static void main(String[] args) {
	
	int [] ar = new int[] {1,3,4,5,2,5,43,5,};
	
	//First way to call a return method! with print return
	System.out.println(find0occurences(ar ,  1));
	
	//Second assign return value to a new variable
	int fives = find0occurences(ar, 5); 
	System.out.println("Array has "+fives+" fives");
	
	if(find0occurences(ar,2)>0) {
		System.out.println("There are " +find0occurences(ar,2)+" twos :)");
	}else {
		System.out.println("There are no twos :(");
	}
	
	//create and array and pass the method
	System.out.println(find0occurences(new int[] {2,2,3,14,5,2,32,3}, 2));
	System.out.println("***************************************************************************************");
	
	System.out.println(Arrays.toString(getArray()));
	
	
}

public static int find0occurences(int [] arr,int value) {
	int count = 0;
	for(int num:arr) {
	if(num == value){
		count++;
	}
	}
	return  count;
}

public static int[] getArray() {
	int [] arr = new int[]{2,3,1,4,12,2};
	return arr;
}
}

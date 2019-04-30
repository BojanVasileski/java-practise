package day24_arrays;

public class ArrayOfChars {
public static void main(String[] args) {
	char[] values = {'a','b','c'};
	
	for (char value: values) {
		System.out.println(value);
	}


String str = "Wooden Spoon";
//this, method toCharArray() converts string into arrays of characters
char[] chars = str.toCharArray();

for(char c:chars) {
	System.out.print(c+"_");
}
System.out.println();


for(int i = chars.length-1; i>=0;i--) {    //reverse array with chars
	System.out.print(chars[i]);
}
System.out.println();
System.out.println();
//TASK print chars with help of array of chars one by one
//if character is equals to 'o', replace it with '*'


for(char single:chars) {
	if(single=='o') {
		System.out.print("*");	
	}else {
		System.out.print(single);
	}
}







}
}
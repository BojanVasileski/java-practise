package HappyFace;

import java.util.Arrays;

public class CharPractice {
	public static void main(String[] args) {
		String phoneNumber = "(240) 576 7834";
		//.toCharArray()  will convert any string into an array of chars
		
		char[] chars = phoneNumber.toCharArray();
		System.out.println(Arrays.toString(chars));
		
		int digitCounter = 0;
		for(char value:chars) {
			if(Character.isDigit(value)) {
				digitCounter++;
			}
		}
		System.out.println("Number of digits: "+digitCounter);
		
		System.out.println("*******************************************************************");
		//Character.isAlphabetic(codePoint)  is used to verify id name is valid
		String name ="Mike";
		boolean isValid = false;
		
		for(char var:name.toCharArray()) {
			System.out.println(Character.isAlphabetic(var));
		}
		
		
		
	}
}

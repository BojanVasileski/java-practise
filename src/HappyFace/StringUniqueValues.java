package HappyFace;

public class StringUniqueValues {
	public static void main(String[] args) {
		String str = "mama";
		String uniques = "";
		
		for (int i = 0; i < str.length();i++) {
			char temp = str.charAt(i);
			int count = 0;
			for(int j = 0;j<str.length()-1;j++) {
				if(temp==str.charAt(j) && i!=j) {
					count++;
				}
			
				
			}
			if(count == 0) {
				System.out.print(temp);
			}
		}
	
		
	}
}

package HappyFace;

public class EmojisWarmUp {
	public static void main(String[] args) {
		String emoji = ":/";
		
		//==,!= 
		if(emoji.length()!=2) {
			System.out.println("Invalid Emoji");
			return;
		}
		//if code reaches this point than emoji is 2 chars
		//get first and second char and assign variable
		
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first == ':') {
			if(second == ')') {
				System.out.println("Smile");
			} else if(second == '(') {
				System.out.println("Sad");
			}else if(second == '/') {
				System.out.println("Upset");
			}else if(second == 'p') {
				System.out.println("playful");
			}else {
				System.out.println("Unkonown emoji");
			}
		}else if (first ==  ';') {
			if(second == ')') {
				System.out.println("Wink");
			}else if (second == '0'){
				System.out.println("Surprised");
			}else  {
				System.out.println("Unknown emoji");
			}
			
		}else if (first == '(') {
			System.out.println("");
		}else if (first == ')') {
			System.out.println("");
		}else {
			System.out.println("Unknown emoji");
			
		}
	
	}

}

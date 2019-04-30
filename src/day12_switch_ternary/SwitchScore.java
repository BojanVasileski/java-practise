package day12_switch_ternary;

public class SwitchScore {
	public static void main(String[] args) {
		int score = 110;
		if(score==1) {
			System.out.println("score is 1");
			
		}else if(score == 2) {
			System.out.println("score is 2");
			
		}else if(score==3) {
			System.out.println("score is 3");
			
		}
		
		switch(score) {											//SWITCH STATEMENT   
		case 1:
			System.out.println("score is 1");
			break;//exit switch statement ??????????????????
		case 2:
			System.out.println("score is 2");
			break;
		case 3:
			System.out.println("score is 3");
			break;
		default:
		System.out.println("Invalid score");
		break;
		}
	}

}

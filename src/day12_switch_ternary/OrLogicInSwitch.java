package day12_switch_ternary;

public class OrLogicInSwitch {
	public static void main(String[] args) {
		char grade = 'E';
		
		switch(grade) {
		case 'A':                 // || logic in switch statement
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
		
		case 'D':
		case 'E':
			System.out.println("Fail");
			
			default:
				System.out.println("Invalid Grade");
		}
	}

}

package day08_casting_conditionals;

public class IfElseWithVariables {
	public static void main(String[] args) {
		
		int temperature = 45;
		
		if(temperature >= 65) {
			System.out.println("Its a nice day! Lets code Java!\n");
		}else {
			System.out.println("Stay home and code Java.\n");
		}
		
		
		//2 int variables, teamAScore, teamBScore
		//put a condition. check if team a won. "team a won"
		//else "team b won or it was a draw
		
		int teamAScore = 15;
		int teamBScore = 19;
		
		if (teamAScore > teamBScore) {
			System.out.println("Go team A!");
		}else {
			System.out.println("Team B won or it was a draw");
		}
		}
	}



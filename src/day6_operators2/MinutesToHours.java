package day6_operators2;

public class MinutesToHours {
	public static void main(String[] args) {
		 int minutes = 15250;
		 int hours = minutes/60;
		 int remainingMinutes = minutes%60;
		 
		 System.out.print(minutes + " minutes is ");
		 System.out.println(hours + " hours and  " + remainingMinutes + " minutes");
		 System.out.println();
		 
	}

}

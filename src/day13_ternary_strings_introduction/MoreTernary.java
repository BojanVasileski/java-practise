package day13_ternary_strings_introduction;

public class MoreTernary {
	public static void main(String[] args) {
		
		String quality = "bad";
		int rating = (quality.equals("good")) ? 100 :0;
		System.out.println(rating);
		
		int hourPm = 6;
		
		boolean rushHour;
		
		rushHour = hourPm<=7 && hourPm>= 4 ? true:false;
		
		if(rushHour==true)
		System.out.println(rushHour);
		
		int hourAm = 8; // 6-9
		
		String amRushHour = hourAm<=9 && hourAm >= 6 ? "Yes" : "No" ;
		
		System.out.println(hourAm + " is rush hour? - " + amRushHour);
		
		
		
		
		
	}

}

package day26_arrays;

import java.util.Arrays;
import java.util.Random;

public class WarmupNames {
public static void main(String[] args) {
	String [] names= {"James","Mary",
			"John","Patricia",
			"Robert","Jennifer",
			"Michael","Linda",
			"William","Elizabeth",
			"David","Barbara",
			"Richard","Susan",
			"Joseph","Jessica",
			"Thomas","Sarah",
			"Charles","Margaret",
			"Christopher","Karen",
			"Daniel","Nancy",
			"Matthew","Lisa",
			"Anthony","Betty",
			"Donald","Dorothy",
			"Mark","Sandra",
			"Paul","Ashley",
			"Steven","Kimberly",
			"Andrew","Donna",
			"Kenneth","Emily",
			"George","Carol",
			"Joshua","Michelle",
			"Kevin","Amanda",
			"Brian","Melissa",
			"Edward","Deborah",
			"Ronald","Stephanie",
			"Timothy","Rebecca",
			"Jason","Laura",
			"Jeffrey","Helen",
			"Ryan","Sharon",
			"Jacob","Cynthia",
			"Gary","Kathleen",
			"Nicholas","Amy",
			"Eric","Shirley",
			"Stephen","Angela",
			"Jonathan","Anna",
			"Larry","Ruth",
			"Justin","Brenda",
			"Scott","Pamela",
			"Brandon","Nicole",
			"Frank","Katherine",
			"Benjamin","Samantha",
			"Gregory","Christine",
			"Raymond","Catherine",
			"Samuel","Virginia",
			"Patrick","Debra",
			"Alexander","Rachel",
			"Jack","Janet",
			"Dennis","Emma",
			"Jerry","Carolyn",
			"Tyler","Maria",
			"Aaron","Heather",
			"Henry","Diane",
			"Jose","Julie",
			"Douglas","Joyce",
			"Peter","Evelyn",
			"Adam","Joan",
			"Nathan","Victoria",
			"Zachary","Kelly",
			"Walter","Christina",
			"Kyle","Lauren",
			"Harold","Frances",
			"Carl","Martha",
			"Jeremy","Judith",
			"Gerald","Cheryl",
			"Keith","Megan",
			"Roger","Andrea",
			"Arthur","Olivia",
			"Terry","Ann",
			"Lawrence","Jean",
			"Sean","Alice",
			"Christian","Jacqueline",
			"Ethan","Hannah",
			"Austin","Doris",
			"Joe","Kathryn",
			"Albert","Gloria",
			"Jesse","Teresa",
			"Willie","Sara",
			"Billy","Janice",
			"Bryan","Marie",
			"Bruce","Julia",
			"Noah","Grace",
			"Jordan","Judy",
			"Dylan","Theresa",
			"Ralph","Madison",
			"Roy","Beverly",
			"Alan","Denise",
			"Wayne","Marilyn",
			"Eugene","Amber",
			"Juan","Danielle",
			"Gabriel","Rose",
			"Louis","Brittany",
			"Russell","Diana",
			"Randy","Abigail",
			"Vincent","Natalie",
			"Philip","Jane",
			"Logan","Lori",
			"Bobby","Alexis",
			"Harry","Tiffany",
			"Johnny","Kayla"};
	
	System.out.println("Total Names "+names.length);
	
	System.out.println(Arrays.toString(names));
	
	//Print in column format.
	//2 names in each line
	
	for(int i = 0; i<names.length-1;i++) {
		System.out.println(names[i]+", "+names[i+1]);
	}
	System.out.println("***************************************************************************************************************");
	System.out.println("MALE NAMES");
	for(int i = 0;i<names.length-1;i+=2 ) {
		System.out.print(names[i] + ", ");
		
	}
	System.out.println();
	System.out.println("***************************************************************************************************************");
	System.out.println("FEMALE NAMES");
	for(int i = 1;i<names.length-1;i+=2 ) {
		System.out.print(names[i] + ", ");
		
	}
	System.out.println();
	System.out.println("***************************************************************************************************************");
	//Print a random name
	Random random= new Random();
	int r = random.nextInt(names.length);		//limiting the random range
	System.out.println("Random name: "+ names[r]);
	//print all names that are up to four chars in upper case in same line]
	System.out.println();
	System.out.println("***************************************************************************************************************");
	int shortNames = 0;
	for(int i = 0; i< names.length-1;i++) {
		if(names[i].length()<=4) {
			System.out.print(names[i].toUpperCase()+", ");
			shortNames++;
		}
	}
	System.out.println();
	System.out.println("Number of short names: "+shortNames);
	
	
	System.out.println("***************************************************************************************************************");
	String names3to4 = "";
	String names5to6 = "";
	String names7ormore = "";
	
	for(int i = 0; i<names.length;i++) {
		if(names[i].length() >=3 && names[i].length()<=4) {
			names3to4 += names[i]+", ";
		}else if (names[i].length() >=5 && names[i].length()<=6) {
			names5to6 += names[i]+", ";
		}else if(names[i].length()>7) {
			names7ormore+=names[i]+", ";
		}
	}
	System.out.println();
	System.out.println("3 to 4 letters: "+names3to4);
	System.out.println("5 to 6 letters: "+names5to6);
	System.out.println("7 or more: "+names7ormore);
	
	System.out.println("***************************************************************************************************************");
	
	
	for(int i  = 0;i<names.length ; i+=2 ) {          //switch place in arrays
		String temp = names[i+1]+", "+ names[i];
		System.out.println(temp);
	}
	
	
}
}

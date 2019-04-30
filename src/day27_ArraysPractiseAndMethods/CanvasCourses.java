package day27_ArraysPractiseAndMethods;

public class CanvasCourses {
public static void main(String[] args) {
	String javaPrograming = "https://learn.cybertekschool.com/courses/147";
	String mentoring = "https://learn.cybertekschool.com/courses/204";
	String sdlc = "https://learn.cybertekschool.com/courses/149";
	String qaTsting = "https://learn.cybertekschool.com/courses/152";
	String teamActivity = "https://learn.cybertekschool.com/courses/144";
	String welcomeKit = "https://learn.cybertekschool.com/courses/143";
	
	String [] course = teamActivity.split("/");
	
	int courseId =Integer.parseInt(course[course.length-1]);       //convert int to String
	
	       		
	
	switch(courseId) {
	case 147:
		System.out.println("Java Programming");
		break;
	case 204:
		System.out.println("Mentoring Session");
		break;
	case 149:
		System.out.println("SDLC");
		break;
	case 152:
		System.out.println("Qa Testing");
		break;
	case 144:
		System.out.println("Team activity");
		break;
	case 143:
		System.out.println("Welcome Kit");
		break;
		default:
			System.out.println("Invalid number for the course");
			break;
		
	}
	
	
}
}

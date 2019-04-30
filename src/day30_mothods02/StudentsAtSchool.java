package day30_mothods02;

public class StudentsAtSchool {
public static void main(String[] args) {
	student("hello");
	sleep(10);
}
	
	public static void student(String topic) {
		
		System.out.println("Student is studying "+ topic);
		
		
	}
	public static void sleep(int hours) {
		System.out.println("Student has been sleeping for "+hours+" hours");
		
	}
}

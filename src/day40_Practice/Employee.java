package day40_Practice;

public class Employee {
	public String name;  //can be used anywhere in a project 
	public String jobTitle;
	double salary;  //can only be used in a same package
	
	public void work() {
		System.out.println(name + " is working.....");
	}
	public void goToBreak() {
		System.out.println(name + " is on a break, DND!");
	}
	public void attendMeeting() {
		System.out.println(name + " is in a meeting, DND!");
	}
	public void introudce() {
		System.out.println("Name: "+ name + ", jobTitle: "+jobTitle + ", salary: "+ salary);
	}
}

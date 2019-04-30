package day29_method01;

public class Student {
	public static void main(String[] args) {
		
		study();
		study();     //calling a custom method
		sayHello();
		code();
	}
	
	public static void study() {
		System.out.println("Student is studing");
	}
	
	//creatte a method sayHello
	
	public static void sayHello(){
		System.out.println("Hello Friends!");
	}
	//create a method withc name code
	
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding Java");
	}
	
}

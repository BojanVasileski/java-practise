package day32_costumMethods;

public class MethodWithReturn {
public static void main(String[] args) {
	System.out.println(giveMe10$());
	int i = giveMe10$();
	System.out.println("i: "+i);
	
	System.out.println(giveMeYourName());
	String myName = giveMeYourName();
	System.out.println("My name is "+ giveMeYourName());
}
	public static int giveMe10$() {
		System.out.println("returnung 10 from method");
		return 10;
	}
	
	public static String giveMeYourName() {
		return "Bojan Vasileski";
	}
}

package day33_methodsWithReturnValue;

public class write2Methods {
public static void main(String[] args) {
	addVoid(10,10);
	int result = add(15,20);
	System.out.println(result);
	System.out.println("***********************************************************");
	System.out.println(miltiply(45,20.3));
	System.out.println("***********************************************************");
	System.out.println(deduct(100,43.2));
	System.out.println("***********************************************************");
	System.out.println(divide(66,20));
	
}

public static void addVoid(int num1, int num2) {
	int sum = num1+num2;
	System.out.println(sum);
}
public static int add(int num1, int num2) {
	int sum = num1+num2;
	return sum;
}

public static double miltiply(double n1, double n2) {
	double sum = n1*n2;
	return sum;
}
public static double deduct(double n1, double n2) {
	double sum = n1-n2;
	return sum;
}
public static double divide(double n1, double n2) {
	if(n2==0) {
		System.out.println("Error: cannot / with 0");
		return 0;
		//System.exit(0);
	}
	double sum = n1/n2;
	return sum;
}

}

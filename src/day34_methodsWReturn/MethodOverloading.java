package day34_methodsWReturn;

public class MethodOverloading {
public static void main(String[] args) {
	add(10,20);
	add("holla","hello");
}
public static void add(int a, int b) {
	System.out.println("Result : "+(a+b));
}
public static void add(double a,double b) {
	System.out.println("Result : "+(a+b));
}
public static void add(String a,String b) {
	System.out.println("Result : "+(a+b));
}

}

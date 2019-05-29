package day52_inheritance05;

public class EqualsMethod {
	public static void main(String[] args) {
		FinalClass comp1 = new FinalClass("Imac","Silver");
		FinalClass comp2 = new FinalClass("Imac","Silver");
		FinalClass comp3 = comp2;;
		
		
		System.out.println(comp1==comp2);
		System.out.println(comp1.equals(comp2));
		
		System.out.println(comp3==comp2);
		System.out.println(comp3.equals(comp2));
	}
}

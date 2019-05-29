package day47_blocks;

public class VariablesAccess {
//instance variable
	int myInstanceVar = 40;
	
//Static variable
	static int myStaticVariable = 55;
	public static void main(String[] args) {
		System.out.println(myStaticVariable);
	
	
	VariablesAccess v = new VariablesAccess();
	System.out.println(v.myInstanceVar);
	System.out.println(v.myStaticVariable);
	System.out.println(VariablesAccess.myStaticVariable);
}
}
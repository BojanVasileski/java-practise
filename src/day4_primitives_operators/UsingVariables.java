package day4_primitives_operators;

public class UsingVariables {
	public static void main(String[] args) {
		//deeclare num1,num2,num3
		int num1, num2, num3;
		num1 = 100;
		num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		num2 = 200;
		num3 = num1;
		num1 = num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		//declare apples and assign 25
		//declare kiwis and assing apples to it
		//declare mangoes and assign 55
		int apples = 25;
		int kiwis = apples;
		int mangoes = 55;
		kiwis = mangoes;
		System.out.println(apples);
		System.out.println(kiwis);
		System.out.println(mangoes);
	}

}

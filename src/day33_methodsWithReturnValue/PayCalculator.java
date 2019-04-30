package day33_methodsWithReturnValue;

public class PayCalculator {
public static void main(String[] args) {
	System.out.println(getHourlyPay(1,0));
}

public static int getHourlyPay(int hours, int rate) {
	
	if(hours <= 0) {
		System.out.println("Invalid hours");
		return 0;
	}
	if (rate <=0) {
		System.out.println("Invalid rate");
		return 0;
	}
	return hours*rate;
}
}

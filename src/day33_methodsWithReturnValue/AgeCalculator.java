package day33_methodsWithReturnValue;

public class AgeCalculator {
public static void main(String[] args) {
	calculateAge(1990);
	
}
public static int calculateAge(int year) {
	int age =2019 - year;
	if(age > 0 && age <=14) {
		System.out.println("child");
		return age;
	}else if(age>=15&&age<=25) {
		System.out.println("youngster");
		return age;
	}else if(age>= 26 && age <= 64) {
		System.out.println("adult");
		return age;
	}else if(age>64) {
		System.out.println("senior");
		return age;
	}else if(age<=0) {
		System.out.println("invalid age");
		return age;
	}
	return age;
}
}

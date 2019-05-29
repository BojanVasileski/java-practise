package HappyFace;

public class WrapperClassPractice {
	public static void main(String[] args) {
		int num =10;
		Integer num2 = new Integer(10);
		Integer num3 = new Integer(10);
		
		System.out.println(num2 == num3);
		System.out.println(num == num2);
		
		 //.intValue() gives actual result
		System.out.println(num2.intValue() == num3.intValue());
		//how to convert text into number
		
		String age = "25";
		int agenum = Integer.parseInt(age); //returns primitive
		int agenum2 = Integer.valueOf(age); //returns object
		if(agenum>21) {
			System.out.println("You are fine!");
		}else {
			System.out.println("Underage!");
		}
		System.out.println("***********************************************************************************");
		
		String wind = "Wind: 2 mph";
		
		//if wind is more than 30 pmg print you are in denger
		//otherwise print you are save
		String [] arr = wind.split(" ");
		int wind1 = Integer.parseInt(arr[1]);
		
		if(wind1 >= 30) {
			System.out.println("You are in danger");
		}else {
			System.out.println("You are save!");
		}
		
		System.out.println("***********************************************************************************");
		
		int maxForInt = Integer.MAX_VALUE;
		int minForInt = Integer.MIN_VALUE;
		System.out.println(minForInt+" | "+maxForInt);
		
		System.out.println(Integer.toBinaryString(5));
	}
}

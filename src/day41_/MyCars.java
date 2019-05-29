package day41_;

public class MyCars {
public static void main(String[] args) {
	Car Toyota = new Car();
	
	Toyota.color = "Silver";
	Toyota.currentSpeed = 77;
	Toyota.make = "Toyota";
	Toyota.model = "Corola";
	
	Toyota.printCarInfo();
	Toyota.showCurrentSpeed(55);
	Toyota.drive();
	
	
	System.out.println("before: "+Toyota.model+" is driving "+Toyota.currentSpeed);
	Toyota.accelerate(13);
	System.out.println("before: "+Toyota.model+" is driving "+Toyota.currentSpeed);
	
	BMW bmw = new BMW();
	System.out.println(bmw.make);
	bmw.model = "740i";
	bmw.showPrice();

	BMW bmw2 = new BMW();
	System.out.println(bmw2.make);
	bmw2.model = "X3";
	bmw2.showPrice();

	

}
}

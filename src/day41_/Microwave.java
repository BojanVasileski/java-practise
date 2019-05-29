package day41_;

public class Microwave {
	String brand;
	boolean isOn;
	
	public void turnOn() {
		
		if(isOn==true) {
			System.out.println(brand+" is on");
		}else {
			System.out.println("Turning on the microwave");
			isOn = true;
		}
	}
	public void turnOff() {
		
		if(isOn==false) {
			System.out.println(brand+" is off");
		}else {
			System.out.println("Turning off the microwave");
			isOn = false;;;;;;;;;
		}
	}
	public void heat(String food) {
		if(isOn==true) {
			System.out.println("Heating the "+food);
		}else {
			System.out.println(brand+" is off cannot heat "+food);
		}
	}
}

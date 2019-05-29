package day41_;

public class Kitchen {
	public static void main(String[] args) {
		Microwave mic = new Microwave();
		mic.brand = "LG";
		mic.turnOff();
		mic.heat("pizza");
		mic.turnOn();
		mic.heat("pizza");
		mic.turnOff();
		mic.heat("pizza");
	}
}

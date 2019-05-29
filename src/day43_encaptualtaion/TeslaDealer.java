package day43_encaptualtaion;

public class TeslaDealer {
	public static void main(String[] args) {
		Tesla model3 = new Tesla();
		
		model3.setCarInfo("camry", 310, 3.2, 55000, true);
		
		System.out.println("Model: "+model3.getModel());
		System.out.println("Range: "+model3.getRange());
		System.out.println("Price: "+model3.getPrice());
		System.out.println("Zero to 60: "+model3.getZeroTo60());
		System.out.println("Autonomus: "+model3.isSelfDriving());
		System.out.println(model3);
		System.out.println(model3.toString());
		
		Tesla modelY = new Tesla();
		
		modelY.setCarInfo("model y", 300, 4.1, 50000, false);
		System.out.println("**********************************************************");
		buy(model3);
		
		Tesla testCar = testDrive("Roadster");
		
		System.out.println(testDrive("Model 3"));
	}
	
	public static void buy(Tesla car) {
		System.out.println("Purchasing: "+ car.toString());
	}
	
	public static Tesla testDrive(String model) {
		System.out.println("I would like to drive - "+model);
		System.out.println("Sure, let me build the object and return it");
		Tesla drive = new Tesla();
		drive.setCarInfo(model, 310, 2.5, 55000, true);
		return drive;
	}
}

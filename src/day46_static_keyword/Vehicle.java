package day46_static_keyword;

public class Vehicle {
String type;  //instance variable, every object has its own type
static int numberOfVehicles;

public static void vehicleInfo() {
	//System.out.println("type: "+ type);  =>will not compile non static variable
	System.out.println("number of vehicles: "+ numberOfVehicles);
}  
public static int getNumberOfVehicles() {
	return numberOfVehicles;
}
 public String toString(){  //cannot call non-static method in same class
	 return "Vehicle type "+ type + " | count; "+numberOfVehicles;
 }
}

package day43_encaptualtaion;

public class Computer {
	private String brand;
	private String os;
	private double cpu;
	
	//add a constructor
	public Computer() {
		System.out.println();System.out.println("Computer constructor...");
		brand  = "unknown";
		os  = "unknown";
		cpu  = 0.0;
	}
	
	public Computer(String brand,String os, double cpu) {
		this.brand = brand;
		this.os = os;
		this.cpu = cpu;
	}
	
	
	public String toString() {
		return "Computer [brand=" + brand + ", os=" + os + ", cpu=" + cpu + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	
}

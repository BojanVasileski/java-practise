package day49_inheritance;

public class Device {
	public String brand;
	protected String model;
	double price;
	private String country;
	
	
	
	/*
	Access modifiers:

		public -> visible to everyone.
		       -> visible to sub classes and non-sub classes in same or other packages

		protected -> visible to everyone in same package and only to sub classes in different packages

		default -> visible to everyone in same package and noone in different packages

		private -> visible to the class itself     
		*/
}

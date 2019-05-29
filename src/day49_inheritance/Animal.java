package day49_inheritance;

public class Animal {
	private String type;
	
	public Animal() {
		
		super();
		System.out.println("Animal Constructor");
		type = "undefined";
		
	}
	public Animal(String type) {
		System.out.println("Anumal 1 arg constructor");
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}

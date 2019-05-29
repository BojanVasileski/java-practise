package day43_encaptualtaion;

public class Pet {
	private String type;
	private String name;
	
	public Pet(String type, String name) {
		this.type = type;
		this.name = name;
		
	}
	
	public Pet() {
		System.out.println("No-args constructor");
	}
	
	public void speak() {
		switch(type.toLowerCase()) {
		case "cat":
			System.out.println("myauuuu");
			break;
		case "dog":
			System.out.println("woof woof");
			break;
		case "bird":
			System.out.println("chi chirik");
			break;
		case "goat":
			System.out.println("mhaaa mhaa");
			break;
		case "sheep":
			System.out.println("bhaaa bhaaa");
			break;
		case "rooster":
			System.out.println("kuku riku");
			break;
		}
	}
	public String toString() {
		return "Pet [type=" + type + ", name=" + name + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

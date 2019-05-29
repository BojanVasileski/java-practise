package day46_static_keyword;

public class Costumer {
	private String name;
	private String email;
	static int costumerCount;
	
	public Costumer() {
		this.name = "undefined";
		email = "undefined";
		costumerCount++;
	}
	public Costumer(String name, String email) {
		//if
		this.name=name;
		setEmail(email);
		costumerCount++;
	}

	
	public String toString() {
		return "Costumer [name=" + name + ", email=" + email + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	
}

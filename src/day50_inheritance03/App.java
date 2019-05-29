package day50_inheritance03;

public class App {
	public static int count;
	private String name;
	
	
	
	public App(String name){
		this.name=name;
	}
	
	protected static void buildWith(String language) {
		System.out.println("Building an app using "+language);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

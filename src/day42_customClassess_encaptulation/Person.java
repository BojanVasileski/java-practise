package day42_customClassess_encaptulation;

public class Person {
	private String name;
	private int age;
	
	public void setInfo(String name,int newAge) {   //setter methods void
		this.name = name; 
		age = newAge;
	}
	public String getInfo() {					//getter methods return value(String)
		return name+ " | "+age;
	}
	
	
	
}

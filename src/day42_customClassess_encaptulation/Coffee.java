package day42_customClassess_encaptulation;

 class Coffee {
String name;
String size;
double price;
int calories;

public  void getCoffeeInfo() {
	System.out.println("Espresso & Brewed Coffee: "+name+"\nSize: "+size+"\nPrice: "+price+"\nCalories: "+calories);
}
public void setName(String newName) {   //setter methods
	name = newName;
}
public void setSize(String newSize) {   //setter methods
	if(newSize.equalsIgnoreCase("TALL") || 
			newSize.equalsIgnoreCase("grande") ||
			newSize.equalsIgnoreCase("Venti")) {
	size = newSize;
	}else {
		System.out.println("ERROR: Invalid Size");
	}
}
public void setPrace(double newPrice) {   //setter methods
	price = newPrice;
}
public void setCal(int newCal) {   //setter methods
	calories = newCal;
}
public void setCoffeeInfo(String newName, String newSize ,   //setter methods
		double newPrice, int newCal) {
	name = newName;
	size = newSize;
	price = newPrice;
	calories = newCal;
	
}
}

package day43_encaptualtaion;

public class Tesla {
private String model;
private int range;
private double zeroTo60;
private double price;
public boolean selfDriving;

public void setCarInfo(String model,int range,double zeroTo60,
		double price, boolean selfDriving) {
	if(isValidModel(model)) {
	this.model=model;
	}else {
		System.out.println("Invaild model - "+model);
		this.model = "Unknown";
	}
	this.range = range;
	this.zeroTo60 = zeroTo60;
	this.price  = price;
	this.selfDriving = selfDriving;
}
public String getModel() {
	return model;
}
public int getRange() {
	return range;
}
public double getZeroTo60() {
	return zeroTo60;
}


public String toString() {
	return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
			+ ", selfDriving=" + selfDriving + "]";
}
public double getPrice() {
	return price;
}
public boolean isSelfDriving() {
	return selfDriving;
}

public boolean isValidModel(String model) {
	if(model.equalsIgnoreCase("model 3") || model.equalsIgnoreCase("model y") ||
			model.equalsIgnoreCase("model x") || model.equalsIgnoreCase("model s") 
			|| model.equalsIgnoreCase("roadster") ) {
	return true;
}
return false;

}

}

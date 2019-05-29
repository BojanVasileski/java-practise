package day52_inheritance05;

public final class FinalClass {
	private String model;
	private String color;
	
	public FinalClass() {
		super();
	}
	
	
	@Override
	public boolean equals(Object other) {
		FinalClass that = (FinalClass) other;
		if(this.model.equals(that.model) && this.color.equals(that.color)) {
			return true;
		}
		return false;
	}
	
	
	
	public FinalClass(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}

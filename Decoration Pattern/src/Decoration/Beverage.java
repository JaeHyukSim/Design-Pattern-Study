package Decoration;

public abstract class Beverage {
	String description;
	
	public Beverage() {
		description = "±âº»°ª";
	}
	public String getDescription() {
		return description;
	}
	public abstract double cost();
}

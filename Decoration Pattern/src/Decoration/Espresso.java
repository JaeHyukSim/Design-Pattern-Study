package Decoration;

import com.sun.org.glassfish.gmbal.Description;

public class Espresso extends Beverage{
	
	String description;
	
	public Espresso() {
		description = "ESPRESSO";
	}
	
	public String getDescription() {
		return description;
	}
	public double cost() {
		return .99;
	}
}

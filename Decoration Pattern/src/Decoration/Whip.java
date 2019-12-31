package Decoration;

public class Whip extends CondimentDecorator{
	Beverage beverage;
	
	public Whip(Beverage bv) {
		this.beverage = bv;
	}
	public String getDescription() {
		return beverage.getDescription() + " »÷«Œ ";
	}
	public double cost() {
		return beverage.cost() + 0.27;
	}
}

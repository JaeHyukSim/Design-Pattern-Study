package Decoration;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage bev) {
		this.beverage = bev;
	}
	public String getDescription() {
		return beverage.getDescription() + " ¸ğÄ« ";
	}
	public double cost() {
		return beverage.cost() + 0.33;
	}
}

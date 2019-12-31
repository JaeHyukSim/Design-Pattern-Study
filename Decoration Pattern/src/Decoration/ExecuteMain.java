package Decoration;

public class ExecuteMain {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
		
		beverage = new Whip(beverage);
		
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
		
		beverage = new Mocha(beverage);
		
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
	}

}

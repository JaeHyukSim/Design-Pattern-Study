package Client;

import Product.Pizza;

public abstract class PizzaStore {
	//1. 피자를 생산한다.
	//2. 피자를 준비한다 - 공통
	//3. 피자를 굽는다 - 공통
	//4. 피자를 자른다 - 공통
	//5. 피자를 포장한다 - 공통
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	
	public abstract Pizza createPizza(String type);
}

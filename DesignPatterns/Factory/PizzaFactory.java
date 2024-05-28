package DesignPatterns.Factory;

public class PizzaFactory {
	public Pizza createPizza(String msg) {
		if(msg.equalsIgnoreCase("Cheese"))
			return new CheesePizza();
		if(msg.equalsIgnoreCase("Chicken"))
			return new ChikenPizza();
		if(msg.equalsIgnoreCase("Veggie"))
			return new VeggiePizza();
		else
			return null;
	}
}

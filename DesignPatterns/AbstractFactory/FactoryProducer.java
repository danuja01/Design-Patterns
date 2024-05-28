package DesignPatterns.AbstractFactory;

public class FactoryProducer {

	public AbstractFactory getPizza(String type) {
		if(type.equalsIgnoreCase("Chicken"))
			return new ChickenFactory();
		if(type.equalsIgnoreCase("Dought"))
			return new DoughtFactory();
		else 
			return null;
	}

}

package Factory;

public class Client {
	public static void main(String[] args) {
		PizzaFactory ob = new PizzaFactory();
		Pizza pizza= ob.createPizza("chicken");
		pizza.getPizza();
	}
}

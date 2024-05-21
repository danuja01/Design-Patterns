package AbstractFactory;

public class Client {
	public static void main(String[] args) {
		FactoryProducer ob = new FactoryProducer();
		
		AbstractFactory chickenFac = ob.getPizza("Chicken");
		Chicken chicken = chickenFac.getChicken("Thanduri");
		chicken.serveChicken();
		AbstractFactory doughtFac = ob.getPizza("Dought");
		Dought dought =  doughtFac.getDought("Thick");
		dought.serveDought();
		
	}
}

package DesignPatterns.AbstractFactory;

public class ChickenFactory extends AbstractFactory {
	
	public Chicken getChicken(String type) {
		if(type.equalsIgnoreCase("Develled"))
			return new DevelledChicken();
		if(type.equalsIgnoreCase("Masala"))
			return new MasalaChicken();
		if(type.equalsIgnoreCase("Thanduri"))
			return new ThanduriChicken();
		else 
			return null;
	}


	@Override
	public Dought getDought(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}

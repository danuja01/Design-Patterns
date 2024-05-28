package DesignPatterns.AbstractFactory;

public class DoughtFactory extends AbstractFactory{
	public Dought getDought(String type) {
		if(type.equalsIgnoreCase("Thin"))
			return new ThickDought();
		if(type.equalsIgnoreCase("Thick"))
			return new ThickDought();
		if(type.equalsIgnoreCase("Double"))
			return new DoubleDought();
		else 
			return null;
	}

	@Override
	public Chicken getChicken(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}

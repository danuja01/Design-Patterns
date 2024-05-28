package DesignPatterns.AbstractFactory;

public abstract class AbstractFactory {
	public abstract Chicken getChicken(String type);
	public abstract Dought getDought(String type);
}

package DesignPatterns.Stratergy;

public class Parrot extends Bird {
	
	

	public Parrot() {
		flyb = new FlyFaster();
	}

	@Override
	public void display() {
		System.out.println("I am Parrot");
	}
	
	
}

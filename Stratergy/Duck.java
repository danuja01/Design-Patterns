package Stratergy;

public class Duck extends Bird {
	
	public Duck() {
		flyb = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am Duck");
	}

	
}

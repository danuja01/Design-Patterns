package DesignPatterns.Stratergy;

public class Hen extends Bird{
	public Hen() {
		flyb = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("I am Hen");
	}
}

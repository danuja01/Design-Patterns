package Stratergy;

public abstract class Bird {
	FlyBehaviour flyb;
	
	public abstract void display();

	public void setFlyb(FlyBehaviour flyb) {
		this.flyb = flyb;
	}
	
	public void performFly() {
		this.flyb.fly();
	}
}

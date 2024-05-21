package Stratergy;

public class Main {
	public static void main(String[] args) {
		Bird bird = new Hen();
		bird.display();
		bird.performFly();
		bird.setFlyb(new FlyFaster());
		bird.performFly();
	}
}
